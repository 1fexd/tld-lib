package fe.tldlib

import fe.tldlib.__tld_gen.TldLetterLookup

object TldTreeFlattener {
    private fun buildTlds(tlds: MutableSet<String>, currentTld: String? = null, node: Map<String, ITldNode>): String? {
        if (node.isEmpty()) return currentTld

        val tldPart = currentTld?.let { ".$it" } ?: ""
        for ((key, childNode) in node) {
            when (childNode) {
                is TldNode -> {
                    val newTld = key + tldPart
                    buildTlds(tlds, newTld, childNode)?.let { tlds.add(newTld) }
                }

                is LeavesTldNode -> tlds.addAll(childNode.leafSet.map { it + tldPart })
            }
        }

        return null
    }

    fun flattenToSet(): Set<String> {
        val set = mutableSetOf<String>()

        val map = mutableMapOf<String, ITldNode>()
        TldLetterLookup.tlds.forEach { (_, tlds) -> map.putAll(tlds.value.getTlds()) }

        buildTlds(set, null, map)
        return set
    }
}
