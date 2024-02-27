package fe.tldlib

import kotlinx.benchmark.*
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.Setup
import org.openjdk.jmh.annotations.State

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(BenchmarkTimeUnit.MILLISECONDS)
@Warmup(iterations = 5, time = 500, timeUnit = BenchmarkTimeUnit.MILLISECONDS)
@Measurement(iterations = 20, time = 5, timeUnit = BenchmarkTimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
class TldExtractorBenchmark {

    @Param("100", "200")
    var tldSubSetSize: Int = 0

    private val subdomainAmount = 0..3
    private val subdomainNameLength = 5..12
    private val hostNameLength = 3..10

    private val characters: Set<String> = listOf((65..90), (48..57))
        .flatten()
        .mapTo(LinkedHashSet()) { it.toChar().toString() }

    private fun generateRandomString(range: IntRange): String {
        return range.iterateRandom().joinToString(separator = "") { characters.random() }
    }

    private fun IntRange.iterateRandom() = 0..random()

    private val hosts = mutableListOf<String>()

    @Setup
    fun prepare() {
        val flatTlds = TldTreeFlattener.flattenToSet()
        val tldSubSet =  flatTlds.shuffled().take(tldSubSetSize)

        for (tld in tldSubSet) {
            val host = buildString {
                subdomainAmount.iterateRandom().forEach { _ ->
                    append(generateRandomString(subdomainNameLength)).append(".")
                }

                val host = generateRandomString(hostNameLength)
                append(host).append(".").append(tld)
            }

            hosts.add(host)
        }
    }

    @TearDown
    fun cleanup() {
        hosts.clear()
    }

    @Benchmark
    fun benchmark(bh: Blackhole) {
        for (host in hosts) {
            bh.consume(TldExtractor.parseHost(host))
        }
    }
}
