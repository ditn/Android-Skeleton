val ktlint: Configuration by configurations.creating

dependencies {
    ktlint(Libraries.ktlint)
}

tasks.register<JavaExec>("ktlint") {
    group = "verification"
    description = "Check Kotlin code style."
    classpath = ktlint
    main = "com.pinterest.ktlint.Main"
    args("--android", "src/**/*.kt")
}

tasks.named("check") {
    dependsOn(ktlint)
}

tasks.register<JavaExec>("ktlintFormat") {
    group = "formatting"
    description = "Fix Kotlin code style deviations."
    classpath = ktlint
    main = "com.pinterest.ktlint.Main"
    args("--android", "-F", "src/**/*.kt")
}