package fe.tldlib

abstract class ITldNode {
    abstract fun getKey(key: String): ITldNode?
}

class TldNode(vararg children: Pair<String, ITldNode>) : ITldNode(), Map<String, ITldNode> by mapOf(*children) {
    override fun getKey(key: String): ITldNode? {
        return this[key]
    }

    companion object {
        private val empty = TldNode()

        fun childless(value: String): Pair<String, TldNode> {
            return value to empty
        }
    }
}

class LeavesTldNode(vararg leaves: String) : ITldNode() {
    val leafSet = setOf(*leaves)
    override fun getKey(key: String): ITldNode? {
        return null
    }
}
