package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_香_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf("香港" to LeavesTldNode("公司","教育","政府","個人","網絡","組織"),TldNode.childless("香格里拉"))
    }
}