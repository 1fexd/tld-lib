from itertools import islice

import requests
from fwutil.FileWriter import open_file

page = requests.get("https://publicsuffix.org/list/public_suffix_list.dat")

icann_domains = []
for line in page.text.splitlines():
    if "END ICANN DOMAINS" in line:
        break
    elif line.startswith("//"):
        continue
    else:
        domain = line.strip()
        if domain and domain != "*":
            icann_domains.append(domain)

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


def tree(node_input):
    txt = ""
    for name, children in node_input.items():
        if len(children) == 0:
            txt += f"TldNode.childless(\"{name}\"),"
        else:
            txt += f"\"{name}\" to TldNode({tree(children)}),"

    return txt


def chunks(data, size=100):
    it = iter(data)
    for i in range(0, len(data), size):
        yield {k: data[k] for k in islice(it, size)}


chunk = 0
for node_chunk in chunks(nodes):
    with open_file(f"../lib/src/main/kotlin/fe/tldlib/Tld{chunk}.kt") as file:
        file.write_multiline(f"""
            package fe.tldlib
        
            val tlds{chunk} = mapOf(
                {tree(node_chunk)}
            )
        """)

    chunk += 1

with open_file(f"../lib/src/main/kotlin/fe/tldlib/Tld.kt") as file:
    tlds = " + ".join([f"tlds{i}" for i in range(chunk)])
    file.write_multiline(f"""
        package fe.tldlib
    
        val tlds = {tlds}
    """)
