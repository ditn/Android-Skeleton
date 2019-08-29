plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

apply(from = "$rootDir/quality/ktlint.gradle.kts")

android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Versions.releaseCode
        versionName = Versions.releaseName
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }
    lintOptions {
        isAbortOnError = false
    }
}

dependencies {
    api(project(":testutils"))
    // Android
    api(Libraries.lifecycleExtensions)
    // RxJava
    api(Libraries.rxKotlin)
    api(Libraries.rxAndroid)
    // Networking
    api(Libraries.okHttpMock)
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
