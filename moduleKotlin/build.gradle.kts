plugins {
    kotlin("jvm")
}

apply(from = "$rootDir/quality/ktlint.gradle.kts")

buildscript {
    dependencies {
        classpath(Libraries.kotlinGradlePlugin)
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    testImplementation(project(":testutils"))
    testImplementation(Libraries.kotlinJunit)
    testImplementation(Libraries.mockitoKotlin)
    testImplementation(Libraries.kluent)
}

tasks {
    test {
        testLogging {
            events("skipped", "failed", "standardOut", "standardError")
        }
    }
}
