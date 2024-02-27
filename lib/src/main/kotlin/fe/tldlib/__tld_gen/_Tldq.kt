package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_q_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf("qa" to LeavesTldNode("com","edu","gov","mil","name","net","org","sch"),TldNode.childless("qpon"),TldNode.childless("quebec"),TldNode.childless("quest"))
    }
}