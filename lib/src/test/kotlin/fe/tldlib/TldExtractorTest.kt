package fe.tldlib

import kotlin.test.Test
import kotlin.test.assertEquals


class TldExtractorTest {
    
    @Test
    fun test() {
        val data = mapOf(
            "hallo.schools.nsw.edu.au" to Host(domainName = "hallo", tld = "schools.nsw.edu.au"),
            "test.ac" to Host(domainName = "test", tld = "ac"),
            "lulexd.gov.ac" to Host(domainName = "lulexd", tld = "gov.ac"),
            "sub1.sub2.name.de" to Host(listOf("sub1", "sub2"), "name", "de")
        )

        data.forEach { (input, output) ->
            assertEquals(output, parseHost(input))
        }
    }
}
