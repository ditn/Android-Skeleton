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
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(Libraries.kotlin)

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
