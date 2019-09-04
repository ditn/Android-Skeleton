package com.adambennett.testutilsandroid.rxjava

import com.adambennett.testutils.testrules.runRule
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.schedulers.TestScheduler
import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldNotBe
import org.junit.Test

class RxInitAndroidTest {

    @Test
    fun `can set io trampoline`() {
        rxInitAndroid { ioTrampoline() }
            .runRule {
                Schedulers.io() shouldBe Schedulers.trampoline()
            }
        Schedulers.io() shouldNotBe Schedulers.trampoline()
    }

    @Test
    fun `can set io to a test scheduler`() {
        val scheduler = TestScheduler()

        rxInitAndroid { io(scheduler) }
            .runRule {
                Schedulers.io() shouldBe scheduler
            }
        Schedulers.io() shouldNotBe scheduler
    }

    @Test
    fun `can set computation trampoline`() {
        rxInitAndroid { computationTrampoline() }
            .runRule {
                Schedulers.computation() shouldBe Schedulers.trampoline()
            }
        Schedulers.computation() shouldNotBe Schedulers.trampoline()
    }

    @Test
    fun `can set computation to a test scheduler`() {
        val scheduler = TestScheduler()

        rxInitAndroid { computation(scheduler) }
            .runRule {
                Schedulers.computation() shouldBe scheduler
            }
        Schedulers.computation() shouldNotBe scheduler
    }

    @Test
    fun `can set single trampoline`() {
        rxInitAndroid { singleTrampoline() }
            .runRule {
                Schedulers.single() shouldBe Schedulers.trampoline()
            }
        Schedulers.single() shouldNotBe Schedulers.trampoline()
    }

    @Test
    fun `can set single to a test scheduler`() {
        val scheduler = TestScheduler()

        rxInitAndroid { single(scheduler) }
            .runRule {
                Schedulers.single() shouldBe scheduler
            }
        Schedulers.single() shouldNotBe scheduler
    }

    @Test
    fun `can set android main to trampoline`() {
        rxInitAndroid { mainTrampoline() }
            .runRule {
                AndroidSchedulers.mainThread() shouldBe Schedulers.trampoline()
            }
    }

    @Test
    fun `can set android main to a test scheduler`() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler { Schedulers.computation() }

        val scheduler = TestScheduler()

        rxInitAndroid { main(scheduler) }
            .runRule {
                AndroidSchedulers.mainThread() shouldBe scheduler
            }
        AndroidSchedulers.mainThread() shouldNotBe scheduler
    }

    @Test
    fun `can set newThread trampoline`() {
        rxInitAndroid { newThreadTrampoline() }
            .runRule {
                Schedulers.newThread() shouldBe Schedulers.trampoline()
            }
        Schedulers.newThread() shouldNotBe Schedulers.trampoline()
    }

    @Test
    fun `can set newThread to a test scheduler`() {
        val scheduler = TestScheduler()

        rxInitAndroid { newThread(scheduler) }
            .runRule {
                Schedulers.newThread() shouldBe scheduler
            }
        Schedulers.newThread() shouldNotBe scheduler
    }
}
