package com.adambennett.testutilsandroid.rxjava

import com.adambennett.testutils.rxjava.RxInit
import com.adambennett.testutils.testrules.after
import com.adambennett.testutils.testrules.before
import io.reactivex.Scheduler
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers

fun rxInitAndroid(block: RxInitAndroid.() -> Unit) =
    before {
        RxInitAndroid().also(block)
    } after {
        RxAndroidPlugins.reset()
        RxAndroidPlugins.setMainThreadSchedulerHandler(null)
        RxJavaPlugins.reset()
    }

class RxInitAndroid : RxInit() {

    fun main(scheduler: Scheduler) {
        RxAndroidPlugins.setMainThreadSchedulerHandler { scheduler }
    }

    fun mainTrampoline() {
        main(Schedulers.trampoline())
    }
}
