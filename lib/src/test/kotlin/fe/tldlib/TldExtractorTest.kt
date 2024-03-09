package fe.tldlib

import kotlin.test.Test
import kotlin.test.assertEquals


internal class TldExtractorTest {

    @Test
    fun test() {
        val data = mapOf(
            "hallo.schools.nsw.edu.au" to TldExtractor.Host(name = "hallo", tld = "schools.nsw.edu.au"),
            "test.ac" to TldExtractor.Host(name = "test", tld = "ac"),
            "lulexd.gov.ac" to TldExtractor.Host(name = "lulexd", tld = "gov.ac"),
            "sub1.sub2.name.de" to TldExtractor.Host(listOf("sub1", "sub2"), "name", "de"),
            "SuB1.sub2.name.De" to TldExtractor.Host(listOf("sub1", "sub2"), "name", "de"),
        )

        data.forEach { (input, output) ->
            assertEquals(output, TldExtractor.parseHost(input))
        }
    }

    @Test
    fun testLeaves(){
        setOf("host.com.ac", "sub1.host.com.ac", "sub1.sub2.host.com.ac", "sub1.sub2.host.gov.ac", "sub1.test.ポイント").forEach { input ->
            val result = TldExtractor.parseHost(input)
            println("input=$input, result=$result")
        }
    }
}
