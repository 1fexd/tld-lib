plugins {
    kotlin("jvm")
    id("net.nemerosa.versioning") version "3.0.0"
    id("org.jetbrains.kotlinx.benchmark") version "0.4.10"
    kotlin("plugin.allopen") version "1.9.20"
    `maven-publish`
}

allOpen {
    annotation("org.openjdk.jmh.annotations.State")
}

group = "fe.tldlib"
version = versioning.info.tag ?: versioning.info.full

repositories {
    mavenCentral()
}

sourceSets {
    create("benchmark")
}
//
//
//

kotlin.target.compilations.getByName("benchmark").associateWith(kotlin.target.compilations.getByName("main"))

benchmark {
    targets {
        register("benchmark")
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime:0.4.10")
    testImplementation(kotlin("test"))

    add("benchmarkImplementation", sourceSets.main.get().output + sourceSets.main.get().runtimeClasspath)
}

tasks.test {
    useJUnitPlatform()
}


//kotlin.target.compilations.getByName("benchmark").associateWith(kotlin.target.compilations.getByName("main"))

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            version = project.version.toString()

            from(components["java"])
        }
    }
}
