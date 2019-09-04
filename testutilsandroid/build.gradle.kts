plugins {
    id("com.android.library")
    kotlin("android")
}

apply(from = "$rootDir/quality/ktlint.gradle.kts")

android {
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
