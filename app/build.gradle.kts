plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
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

    // Google
    implementation(Libraries.appCompat)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.lifecycleExtensions)
    implementation(Libraries.lifecycleViewModelKtx)
    implementation(Libraries.ktxActivity)
    implementation(Libraries.ktxFragments)
    implementation(Libraries.ktxViewModel)

    // Rx
    implementation(Libraries.rxKotlin)
    implementation(Libraries.rxAndroid)

    // Injection
    implementation(Libraries.daggerAndroid)
    implementation(Libraries.daggerAndroidSupport)
    kapt(Libraries.daggerAndroidKapt)
    kapt(Libraries.daggerCompiler)

    // Unit Tests
    testImplementation(project(":testutils"))
    testImplementation(project(":testutilsandroid"))
    testImplementation(Libraries.kotlinJunit)
    testImplementation(Libraries.kluent)
    testImplementation(Libraries.mockitoKotlin)

    // UI Tests
    androidTestImplementation(Libraries.testRunner)
    androidTestImplementation(Libraries.testRules)
    androidTestImplementation(Libraries.testJunit)
    androidTestImplementation(Libraries.espressoCore)
}
