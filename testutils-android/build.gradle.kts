plugins {
    id("com.android.library")
    kotlin("android")
}

apply(from = "$rootDir/quality/ktlint.gradle.kts")

android {
    defaultConfig {
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
    implementation(Libraries.rxAndroid)
    // Networking
    api(Libraries.okHttpMock)
}
