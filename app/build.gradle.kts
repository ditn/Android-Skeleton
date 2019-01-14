plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

apply(from = "$rootDir/quality/ktlint.gradle.kts")

android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        applicationId = Versions.applicationId
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Versions.releaseCode
        versionName = Versions.releaseName
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    packagingOptions.exclude("META-INF/main.kotlin_module")
}

dependencies {
    implementation(project(":moduleKotlin"))
    implementation(project(":moduleAndroid"))

    implementation(Libraries.kotlin)
    implementation(Libraries.appCompat)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.lifecycleExtensions)

    testImplementation(project(":testutils"))
    testImplementation(project(":testutils-android"))
    testImplementation(Libraries.kotlinJunit)
    testImplementation(Libraries.kluent)
    testImplementation(Libraries.mockitoKotlin)

    androidTestImplementation(Libraries.testRunner)
    androidTestImplementation(Libraries.testRules)
    androidTestImplementation(Libraries.testJunit)
    androidTestImplementation(Libraries.espressoCore)
}
