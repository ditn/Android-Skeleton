plugins {
    kotlin("jvm")
}

apply(from = "../quality/ktlint.gradle.kts")

buildscript {
    repositories {
        mavenCentral()
    }
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

    testImplementation(Libraries.kotlinJunit)
    testImplementation(Libraries.mockitoKotlin)
    testImplementation(Libraries.json)
    testImplementation(Libraries.kluent)
}

tasks {
    test {
        testLogging {
            events("skipped", "failed", "standardOut", "standardError")
        }
    }
}
