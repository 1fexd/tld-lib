package fe.tldlib

import fe.tldlib.__tld_gen.TldLetterLookup


object TldExtractor {
    data class Host(
        val subdomains: List<String> = emptyList(),
        val name: String,
        val tld: String
    )

    fun parseHost(host: String): Host? {
        val items = host.lowercase().split(".")
        if (items.isEmpty()) return null
        if (items.size == 2) return Host(name = items[0], tld = items[1])

        val reversedItems = items.reversed()
        val lastItem = reversedItems[0].lowercase()
        val lastChar = lastItem[0].toString()

        val tldBase = TldLetterLookup.tlds[lastChar]?.value ?: return null
        var lastNode = tldBase.getTlds()
        for ((idx, item) in reversedItems.withIndex()) {
            when (val currentNode = lastNode[item.lowercase()]) {
                is TldNode? -> {
                    if (!currentNode.isNullOrEmpty()) {
                        lastNode = currentNode!!
                    } else {
                        return Host(
                            items.take(items.size - idx - 2),
                            items[items.size - idx - 2],
                            items.takeLast(idx + 1).joinToString(separator = ".")
                        )
                    }
                }

                is LeavesTldNode -> {
                    val leaves = items.takeLast(idx + 2)
                    if (leaves[0] !in currentNode.leafSet) return null

                    return Host(
                        items.take(items.size - idx - 3),
                        items[items.size - idx - 3],
                        leaves.joinToString(separator = ".")
                    )
                }
            }
        }

        return null
    }
}



