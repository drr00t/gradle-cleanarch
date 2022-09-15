plugins {
    id("application")
}

application {
    mainClass.set("org.sample.myapp.Main")
}

dependencies {
    implementation("org.sample:commands:1.0")
    implementation("org.sample:queries:1.0")
}

group = "org.sample"
version = "1.0"

repositories {
    mavenCentral()
}
