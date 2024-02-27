package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_x_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf(TldNode.childless("xxx"),TldNode.childless("xbox"),TldNode.childless("xerox"),TldNode.childless("xihuan"),TldNode.childless("xin"),TldNode.childless("xyz"))
    }
}