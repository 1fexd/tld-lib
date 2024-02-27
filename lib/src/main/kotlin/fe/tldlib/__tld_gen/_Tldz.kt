package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_z_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf("za" to LeavesTldNode("ac","agric","alt","co","edu","gov","grondar","law","mil","net","ngo","nic","nis","nom","org","school","tm","web"),"zm" to LeavesTldNode("ac","biz","co","com","edu","gov","info","mil","net","org","sch"),"zw" to LeavesTldNode("ac","co","gov","mil","org"),TldNode.childless("zappos"),TldNode.childless("zara"),TldNode.childless("zero"),TldNode.childless("zip"),TldNode.childless("zone"),TldNode.childless("zuerich"))
    }
}