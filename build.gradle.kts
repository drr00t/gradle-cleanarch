defaultTasks("run")

tasks.register("run") {
    dependsOn(gradle.includedBuild("my-app").task(":app:run"))
}

tasks.register("checkAll") {
    dependsOn(gradle.includedBuild("my-app").task(":app:check"))
    dependsOn(gradle.includedBuild("business").task(":commands:check"))
    dependsOn(gradle.includedBuild("business").task(":queries:check"))
    dependsOn(gradle.includedBuild("domain").task(":aggregates:check"))
}
