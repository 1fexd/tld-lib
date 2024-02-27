package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_r_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf("re" to LeavesTldNode("asso","com","nom"),"ro" to LeavesTldNode("arts","com","firm","info","nom","nt","org","rec","store","tm","www"),"rs" to LeavesTldNode("ac","co","edu","gov","in","org"),TldNode.childless("ru"),"rw" to LeavesTldNode("ac","co","coop","gov","mil","net","org"),TldNode.childless("racing"),TldNode.childless("radio"),TldNode.childless("read"),TldNode.childless("realestate"),TldNode.childless("realtor"),TldNode.childless("realty"),TldNode.childless("recipes"),TldNode.childless("red"),TldNode.childless("redstone"),TldNode.childless("redumbrella"),TldNode.childless("rehab"),TldNode.childless("reise"),TldNode.childless("reisen"),TldNode.childless("reit"),TldNode.childless("reliance"),TldNode.childless("ren"),TldNode.childless("rent"),TldNode.childless("rentals"),TldNode.childless("repair"),TldNode.childless("report"),TldNode.childless("republican"),TldNode.childless("rest"),TldNode.childless("restaurant"),TldNode.childless("review"),TldNode.childless("reviews"),TldNode.childless("rexroth"),TldNode.childless("rich"),TldNode.childless("richardli"),TldNode.childless("ricoh"),TldNode.childless("ril"),TldNode.childless("rio"),TldNode.childless("rip"),TldNode.childless("rocks"),TldNode.childless("rodeo"),TldNode.childless("rogers"),TldNode.childless("room"),TldNode.childless("rsvp"),TldNode.childless("rugby"),TldNode.childless("ruhr"),TldNode.childless("run"),TldNode.childless("rwe"),TldNode.childless("ryukyu"))
    }
}