package fe.tldlib

class TldNode(vararg children: Pair<String, TldNode>) : Map<String, TldNode> by mapOf(*children) {
    companion object {
        private val empty = TldNode()

        fun childless(value: String): Pair<String, TldNode> {
            return value to empty
        }
    }
}
