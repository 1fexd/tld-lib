package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_y_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf(TldNode.childless("yt"),"ye" to LeavesTldNode("com","edu","gov","net","mil","org"),TldNode.childless("yachts"),TldNode.childless("yahoo"),TldNode.childless("yamaxun"),TldNode.childless("yandex"),TldNode.childless("yodobashi"),TldNode.childless("yoga"),TldNode.childless("yokohama"),TldNode.childless("you"),TldNode.childless("youtube"),TldNode.childless("yun"))
    }
}