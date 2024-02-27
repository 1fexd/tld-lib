package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_慈_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf(TldNode.childless("慈善"))
    }
}