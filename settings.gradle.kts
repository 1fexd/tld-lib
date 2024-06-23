rootProject.name = "tld-lib"

include("lib")

if (System.getenv("JITPACK")?.toBooleanStrictOrNull() != false) {
    include("testing")
}
