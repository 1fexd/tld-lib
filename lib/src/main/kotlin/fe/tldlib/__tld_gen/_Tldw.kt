package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_w_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf(TldNode.childless("wf"),"ws" to LeavesTldNode("com","net","org","gov","edu"),TldNode.childless("wales"),TldNode.childless("walmart"),TldNode.childless("walter"),TldNode.childless("wang"),TldNode.childless("wanggou"),TldNode.childless("watch"),TldNode.childless("watches"),TldNode.childless("weather"),TldNode.childless("weatherchannel"),TldNode.childless("webcam"),TldNode.childless("weber"),TldNode.childless("website"),TldNode.childless("wed"),TldNode.childless("wedding"),TldNode.childless("weibo"),TldNode.childless("weir"),TldNode.childless("whoswho"),TldNode.childless("wien"),TldNode.childless("wiki"),TldNode.childless("williamhill"),TldNode.childless("win"),TldNode.childless("windows"),TldNode.childless("wine"),TldNode.childless("winners"),TldNode.childless("wme"),TldNode.childless("wolterskluwer"),TldNode.childless("woodside"),TldNode.childless("work"),TldNode.childless("works"),TldNode.childless("world"),TldNode.childless("wow"),TldNode.childless("wtc"),TldNode.childless("wtf"))
    }
}