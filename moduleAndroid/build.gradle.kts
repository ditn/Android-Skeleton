plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

apply(from = "../quality/ktlint.gradle.kts")

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
}

dependencies {
    implementation(Libraries.appCompat)

    testImplementation(Libraries.kotlinJunit)
    testImplementation(Libraries.kluent)
    testImplementation(Libraries.mockitoKotlin)

    androidTestImplementation(Libraries.testRunner)
    androidTestImplementation(Libraries.testMonitor)
    androidTestImplementation(Libraries.testRules)
    androidTestImplementation(Libraries.testJunit)
    androidTestImplementation(Libraries.espressoCore)
}