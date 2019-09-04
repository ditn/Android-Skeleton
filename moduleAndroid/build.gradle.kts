plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

apply(from = "$rootDir/quality/ktlint.gradle.kts")

dependencies {
    implementation(Libraries.appCompat)
    implementation(Libraries.rxKotlin)
    implementation(Libraries.rxJava)

    testImplementation(project(":testutils"))
    testImplementation(project(":testutils-android"))
    testImplementation(Libraries.kotlinJunit)
    testImplementation(Libraries.kluent)
    testImplementation(Libraries.mockitoKotlin)

    androidTestImplementation(Libraries.testRunner)
    androidTestImplementation(Libraries.testMonitor)
    androidTestImplementation(Libraries.testRules)
    androidTestImplementation(Libraries.testJunit)
    androidTestImplementation(Libraries.espressoCore)
}