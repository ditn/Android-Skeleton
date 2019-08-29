package com.adambennett.testutils.rxjava

import com.adambennett.testutils.testrules.runRule
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.schedulers.TestScheduler
import org.amshove.kluent.`should be`
import org.amshove.kluent.`should not be`
import org.junit.Test

class RxInitAndroidTest {

    @Test
    fun `can set io trampoline`() {
        rxInitAndroid { ioTrampoline() }
            .runRule {
                Schedulers.io() `should be` Schedulers.trampoline()
            }
        Schedulers.io() `should not be` Schedulers.trampoline()
    }

    @Test
    fun `can set io to a test scheduler`() {
        val scheduler = TestScheduler()

        rxInitAndroid { io(scheduler) }
            .runRule {
                Schedulers.io() `should be` scheduler
            }
        Schedulers.io() `should not be` scheduler
    }

    @Test
    fun `can set computation trampoline`() {
        rxInitAndroid { computationTrampoline() }
            .runRule {
                Schedulers.computation() `should be` Schedulers.trampoline()
            }
        Schedulers.computation() `should not be` Schedulers.trampoline()
    }

    @Test
    fun `can set computation to a test scheduler`() {
        val scheduler = TestScheduler()

        rxInitAndroid { computation(scheduler) }
            .runRule {
                Schedulers.computation() `should be` scheduler
            }
        Schedulers.computation() `should not be` scheduler
    }

    @Test
    fun `can set single trampoline`() {
        rxInitAndroid { singleTrampoline() }
            .runRule {
                Schedulers.single() `should be` Schedulers.trampoline()
            }
        Schedulers.single() `should not be` Schedulers.trampoline()
    }

    @Test
    fun `can set single to a test scheduler`() {
        val scheduler = TestScheduler()

        rxInitAndroid { single(scheduler) }
            .runRule {
                Schedulers.single() `should be` scheduler
            }
        Schedulers.single() `should not be` scheduler
    }

    @Test
    fun `can set android main to trampoline`() {
        rxInitAndroid { mainTrampoline() }
            .runRule {
                AndroidSchedulers.mainThread() `should be` Schedulers.trampoline()
            }
    }

    @Test
    fun `can set android main to a test scheduler`() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler { Schedulers.computation() }

        val scheduler = TestScheduler()

        rxInitAndroid { main(scheduler) }
            .runRule {
                AndroidSchedulers.mainThread() `should be` scheduler
            }
        AndroidSchedulers.mainThread() `should not be` scheduler
    }

    @Test
    fun `can set newThread trampoline`() {
        rxInitAndroid { newThreadTrampoline() }
            .runRule {
                Schedulers.newThread() `should be` Schedulers.trampoline()
            }
        Schedulers.newThread() `should not be` Schedulers.trampoline()
    }

    @Test
    fun `can set newThread to a test scheduler`() {
        val scheduler = TestScheduler()

        rxInitAndroid { newThread(scheduler) }
            .runRule {
                Schedulers.newThread() `should be` scheduler
            }
        Schedulers.newThread() `should not be` scheduler
    }
}
