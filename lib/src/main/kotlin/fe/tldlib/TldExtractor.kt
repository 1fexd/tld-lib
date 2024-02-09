package fe.tldlib

data class Host(
    val subdomains: List<String> = emptyList(),
    val domainName: String,
    val tld: String
)


fun parseHost(host: String): Host? {
    val items = host.split(".")
    if (items.isEmpty()) return null
    if (items.size == 2) return Host(domainName = items[0], tld = items[1])

    var lastNode: Map<String, TldNode> = tlds
    for ((idx, item) in items.reversed().withIndex()) {
        val currentNode = lastNode[item]
        if (!currentNode.isNullOrEmpty()) {
            lastNode = currentNode
        } else {
            return Host(
                items.take(items.size - idx - 2),
                items[items.size - idx - 2],
                items.takeLast(idx + 1).joinToString(separator = ".")
            )
        }
    }

    return null
}
