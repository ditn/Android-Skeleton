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
    // RxJava
    implementation(Libraries.rxKotlin)
    // Networking
    implementation(Libraries.okHttpMock)
    implementation(Libraries.retrofit)
    implementation(Libraries.moshi)
    implementation(Libraries.retrofitRxMoshiConverter)
    implementation(Libraries.retrofitRxJavaAdapter)
    // Injection
    implementation(Libraries.koinTest)
    // Unit Test dependencies
    implementation(Libraries.kotlinJunit)
    implementation(Libraries.kluent)
}