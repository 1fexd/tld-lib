package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_ไ_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf("ไทย" to LeavesTldNode("ศึกษา","ธุรกิจ","รัฐบาล","ทหาร","เน็ต","องค์กร"))
    }
}