// val ktor_version: String by project
// val kotlin_version: String by project
// val logback_version: String by project

plugins {
    application
    id("org.jetbrains.kotlin.jvm") version "1.7.10"
    kotlin("plugin.serialization").version("1.7.10")
}

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

group = "org.sample"
version = "1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
}

dependencies {
    implementation("org.sample:commands:1.0")
    implementation("org.sample:queries:1.0")
    implementation("io.ktor:ktor-server-core:2.1.1")
    implementation("io.ktor:ktor-server-netty:2.1.1")
    implementation("io.ktor:ktor-server-content-negotiation:2.1.1")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.1.1")
    implementation("ch.qos.logback:logback-classic:1.2.11")
    testImplementation("io.ktor:ktor-server-test-host:2.1.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.10")
}

