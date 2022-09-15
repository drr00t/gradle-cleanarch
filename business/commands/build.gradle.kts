plugins {
    `java-library`
}

group = "org.sample"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.sample:aggregates:1.0")
}
