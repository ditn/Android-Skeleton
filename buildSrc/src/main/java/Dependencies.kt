@file:Suppress("unused")

object Versions {

    // Release info
    const val applicationId = "com.adambennett.template"
    const val minSdk = 24
    const val targetSdk = 29
    const val compileSdk = 29
    const val releaseCode = 1
    const val releaseName = "0.0.1"

    // Build tools and languages
    const val androidPlugin = "3.6.0-alpha09"
    const val kotlin = "1.3.50"
    const val googleServicesPlugin = "4.2.0"
    const val coveralls = "2.8.2"
    const val buildProperties = "0.4"
    const val ktlint = "0.34.0"
    const val kotlinJvmTarget = "1.6"
    const val javaCompatibilityVersion = 1.8

    // Support Libraries
    const val googleServices = "15.0.1"
    const val firebaseMessaging = "17.0.0"
    const val firebaseCore = "16.0.1"

    // AndroidX
    const val activity = "1.1.0-rc01"
    const val appCompat = "1.1.0-rc01"
    const val design = "1.1.0-alpha05"
    const val recyclerView = "1.0.0"
    const val cardView = "1.0.0"
    const val constraintLayout = "2.0.0-alpha2"
    const val lifecycle = "2.0.0-rc01"
    const val annotations = "1.1.0-beta01"
    const val multidex = "2.0.0"
    const val dynamicAnims = "1.0.0"
    const val room = "2.0.0-rc01"

    // KTX
    const val ktxCore = "1.1.0-alpha05"
    const val ktxFragments = "1.1.0-rc04"
    const val ktxActivity = "1.0.0-rc01"
    const val ktxViewModel = "2.1.0-alpha04"

    // Networking, RxJava
    const val retrofit = "2.4.0"
    const val okHttp = "3.10.0"
    const val okIo = "1.14.1"
    const val moshi = "1.8.0"
    const val rxJava = "2.2.12"
    const val rxKotlin = "2.4.0"
    const val rxAndroid = "2.1.1"
    const val rxBinding = "3.0.0"
    const val rxFingerprint = "2.2.1"

    // Injection
    const val dagger = "2.24"
    const val koin = "2.0.1"

    // Utils
    const val commonsCodec = "1.3"
    const val commonsLang = "3.4"
    const val commonsCli = "1.3"
    const val commonsIo = "2.4"
    const val guava = "24.0-android"
    const val dexter = "4.2.0"

    // Logging
    const val timber = "4.6.0"
    const val crashlytics = "2.9.4"
    const val fabricTools = "1.24.4"

    // Testing
    const val mockito = "2.27.0"
    const val mockitoKotlin = "2.1.0"
    const val kluent = "1.53"
    const val junit = "4.12"
    const val robolectric = "3.8"
    const val json = "20140107"
    const val espresso = "3.2.0-alpha04"
    const val jacoco = "0.8.1"
    const val testRunner = "1.2.0-alpha04"
    const val textJunit = "1.1.1-alpha04"
}

object Libraries {

    // Build tools and languages
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidPlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinAllOpen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin}"
    const val coveralls = "org.kt3k.gradle.plugin:coveralls-gradle-plugin:${Versions.coveralls}"
    const val googleServicesPlugin = "com.google.gms:google-services:${Versions.googleServicesPlugin}"
    const val buildProperties = "com.novoda:gradle-build-properties-plugin:${Versions.buildProperties}"
    const val ktlint = "com.pinterest:ktlint:${Versions.ktlint}"

    // AndroidX
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val design = "com.google.android.material:material:${Versions.design}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val constraintLayoutSolver = "androidx.constraintlayout:constraintlayout-solver:${Versions.constraintLayout}"
    const val annotations = "androidx.annotation:annotation:${Versions.annotations}"
    const val multidex = "androidx.multidex:multidex:${Versions.multidex}"
    const val dynamicAnims = "androidx.dynamicanimation:dynamicanimation:${Versions.dynamicAnims}"

    // Lifecycle
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"

    // Room
    const val roomRx = "androidx.room:room-rxjava2:${Versions.room}"
    const val roomTesting = "androidx.room:room-testing:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    // KTX
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"
    const val ktxFragments = "androidx.fragment:fragment-ktx:${Versions.ktxFragments}"
    const val ktxActivity = "androidx.activity:activity-ktx:${Versions.ktxActivity}"
    const val ktxViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ktxViewModel}"

    // Google & Firebase
    const val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebaseCore}"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging:${Versions.firebaseMessaging}"
    const val googlePlayServicesBase = "com.google.android.gms:play-services-base:${Versions.googleServices}"

    // Networking
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitRxMoshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val retrofitRxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val okIo = "com.squareup.okio:okio:${Versions.okIo}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val moshiKotlinCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"

    // RxJava
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val rxBindingPlatform = "com.jakewharton.rxbinding3:rxbinding:${Versions.rxBinding}"
    const val rxBindingMaterial =  "com.jakewharton.rxbinding3:rxbinding-material:${Versions.rxBinding}"
    const val rxBindingCore =  "com.jakewharton.rxbinding3:rxbinding-core:${Versions.rxBinding}"
    const val rxBindingAppCompat =  "com.jakewharton.rxbinding3:rxbinding-appcompat:${Versions.rxBinding}"
    const val rxBindingDrawerlayout =  "com.jakewharton.rxbinding3:rxbinding-drawerlayout:${Versions.rxBinding}"
    const val rxBindingRecyclerView =  "com.jakewharton.rxbinding3:rxbinding-recyclerview:${Versions.rxBinding}"
    const val rxBindingSlidingPaneLayout = "com.jakewharton.rxbinding3:rxbinding-slidingpanelayout:${Versions.rxBinding}"
    const val rxBindingSwipeRefreshLayout =  "com.jakewharton.rxbinding3:rxbinding-swiperefreshlayout:${Versions.rxBinding}"
    const val rxBindingViewPager =  "com.jakewharton.rxbinding3:rxbinding-viewpager:${Versions.rxBinding}"

    const val rxFingerprint = "com.mtramin:rxfingerprint:${Versions.rxFingerprint}"

    // Injection
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerKapt = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val koin = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val koinTest = "org.koin:koin-test:${Versions.koin}"

    // Utils
    const val commonsCodec = "commons-codec:commons-codec:${Versions.commonsCodec}"
    const val commonsLang = "org.apache.commons:commons-lang3:${Versions.commonsLang}"
    const val commonsCli = "commons-cli:commons-cli:${Versions.commonsCli}"
    const val commonsIo = "commons-io:commons-io:${Versions.commonsIo}"
    const val guava = "com.google.guava:guava:${Versions.guava}"
    const val dexter = "com.karumi:dexter:${Versions.dexter}"

    // Logging
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}@aar"
    const val fabricTools = "io.fabric.tools:gradle:${Versions.fabricTools}"

    // Testing
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    const val kluent = "org.amshove.kluent:kluent-android:${Versions.kluent}"
    const val kotlinJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val junit = "junit:junit:${Versions.junit}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val json = "org.json:json:${Versions.json}"
    const val testRules = "androidx.test:rules:${Versions.testRunner}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val testJunit = "androidx.test.ext:junit-ktx:${Versions.textJunit}"
    const val testMonitor = "androidx.test:monitor:${Versions.testRunner}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val okHttpMock = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"
    const val jacoco = "org.jacoco:org.jacoco.core:${Versions.jacoco}"
}