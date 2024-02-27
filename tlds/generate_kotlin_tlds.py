import os
import shutil
from abc import ABC
from collections import defaultdict
from itertools import islice
from fwutil.FileWriter import open_file
from get_tlds import get_tlds

icann_domains = get_tlds()
nodes = {}

for domains in icann_domains:
    split = domains.split(".")
    split.reverse()

    last_node = nodes
    for item in split:
        if item in last_node:
            last_node = last_node[item]
        else:
            last_node[item] = {}
            last_node = last_node[item]


class TldNode(ABC):
    def __init__(self, name: str):
        self.name = name


class TldChildlessNode(TldNode):
    def __init__(self, name):
        super().__init__(name)

    def __str__(self):
        return f"TldNode.childless(\"{self.name}\")"


class TldLeavesNode(TldNode):
    def __init__(self, leaves: list[TldNode]):
        self.leaf_nodes = leaves

    def __str__(self):
        leaf_str = ",".join([f"\"{_node.name}\"" for _node in self.leaf_nodes])
        return f"LeavesTldNode({leaf_str})"


class TldChildren(TldNode):
    def __init__(self, name, children: list[TldNode]):
        super().__init__(name)
        self.children = children

    def __str__(self):
        # name_map_to_str = f"\"{self.name}\" to lazy {{ {0} }}"
        if len(self.children) == 1:
            single_node = self.children[0]
            if isinstance(single_node, TldLeavesNode):
                return f"\"{self.name}\" to {single_node.__str__()}"

        child_tree = ",".join([child.__str__() for child in self.children])

        return f"\"{self.name}\" to TldNode({child_tree})"


def leaf_to_node(name):
    return f"TldNode.childless(\"{name}\"),"


def tree(node_input, level) -> list[TldNode]:
    _nodes: TldNode = []
    leaves_only = True
    for name, children in node_input.items():
        if len(children) == 0:
            _nodes.append(TldChildlessNode(name))
        else:
            leaves_only = False
            child_nodes = tree(children, level + 1)
            _nodes.append(TldChildren(name, child_nodes))

    if leaves_only and level > 0:
        return [TldLeavesNode(_nodes)]

    return _nodes


def chunks(data, size=100):
    it = iter(data)
    for i in range(0, len(data), size):
        yield {k: data[k] for k in islice(it, size)}


def chunk_new(data_dictionary) -> dict[str, dict]:
    letter_dict = defaultdict(dict)

    for key, children in data_dictionary.items():
        _letter = key[0]
        letter_dict[_letter].update({key: children})

    return letter_dict


generated_package = "fe.tldlib.__tld_gen"
package_dir_names = [dir_name for dir_name in generated_package.split(".")]

library_src_path = os.path.join("lib", "src", "main", "kotlin", *package_dir_names)

pkg_path = os.path.join("..", library_src_path)
if os.path.exists(pkg_path):
    shutil.rmtree(pkg_path)

os.makedirs(pkg_path)


def open_tld_file(_chunk=""):
    return open_file(os.path.join(pkg_path, f"_Tld{_chunk}.kt"))


letter_map_lookup = {}
for letter, _dicts in chunk_new(nodes).items():
    with open_tld_file(letter) as file:
        tree_str = ",".join([_node.__str__() for _node in tree(_dicts, 0)])

        letter_map_name = f"_{letter}_tlds"
        file.write_multiline(f"""
            package {generated_package}

            import fe.tldlib.ITldNode
            import fe.tldlib.TldNode
            import fe.tldlib.LeavesTldNode
            import fe.tldlib.TldBase

            internal class O{letter_map_name} : TldBase {{
                override fun getTlds(): Map<String, ITldNode> {{
                    return mapOf({tree_str})
                }}
            }}
        """)

    letter_map_lookup[letter] = letter_map_name


with open_file(os.path.join(pkg_path, "TldLetterLookup.kt")) as file:
    letter_lookup = ",".join([f"\"{letter}\" to lazy {{ O{_map}() }}" for letter, _map in letter_map_lookup.items()])

    # tlds = " + ".join([f"_tlds{i}" for i in range(chunk)])
    file.write_multiline(f"""
        package {generated_package}

        import fe.tldlib.ITldNode
        import fe.tldlib.TldBase

        internal object TldLetterLookup {{
            val tlds: Map<String, Lazy<TldBase>> = mapOf({letter_lookup})
        }}
    """)
