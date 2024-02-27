package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_с_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf("срб" to LeavesTldNode("пр","орг","обр","од","упр","ак"),TldNode.childless("сайт"))
    }
}