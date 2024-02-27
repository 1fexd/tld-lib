package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_e_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf("ec" to LeavesTldNode("com","info","net","fin","k12","med","pro","org","edu","gov","gob","mil"),TldNode.childless("edu"),"ee" to LeavesTldNode("edu","gov","riik","lib","med","com","pri","aip","org","fie"),"eg" to LeavesTldNode("com","edu","eun","gov","mil","name","net","org","sci"),TldNode.childless("er"),"es" to LeavesTldNode("com","nom","org","gob","edu"),"et" to LeavesTldNode("com","gov","org","edu","biz","name","info","net"),TldNode.childless("eu"),TldNode.childless("earth"),TldNode.childless("eat"),TldNode.childless("eco"),TldNode.childless("edeka"),TldNode.childless("education"),TldNode.childless("email"),TldNode.childless("emerck"),TldNode.childless("energy"),TldNode.childless("engineer"),TldNode.childless("engineering"),TldNode.childless("enterprises"),TldNode.childless("epson"),TldNode.childless("equipment"),TldNode.childless("ericsson"),TldNode.childless("erni"),TldNode.childless("esq"),TldNode.childless("estate"),TldNode.childless("eurovision"),TldNode.childless("eus"),TldNode.childless("events"),TldNode.childless("exchange"),TldNode.childless("expert"),TldNode.childless("exposed"),TldNode.childless("express"),TldNode.childless("extraspace"))
    }
}