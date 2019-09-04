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
    // RxJava
    api(Libraries.rxKotlin)
    // Networking
    implementation(Libraries.okHttpMock)
    api(Libraries.retrofit)
    api(Libraries.moshi)
    api(Libraries.retrofitRxMoshiConverter)
    api(Libraries.retrofitRxJavaAdapter)
    // Injection
    api(Libraries.koinTest)
    // Unit Test dependencies
    api(Libraries.kotlinJunit)
    api(Libraries.kluent)
}