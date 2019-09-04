package com.adambennett.moduleandroid

import com.adambennett.testutilsandroid.rxjava.lifecycle.TestLifecycleOwner
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.plusAssign
import org.amshove.kluent.shouldEqual
import org.junit.Test

class LifecycleCompositeDisposableTest {

    private val lifeCycleOwner =
        TestLifecycleOwner()

    @Test
    fun `can add subscriptions`() {
        val disposable: CompositeDisposable by LifecycleCompositeDisposable(lifeCycleOwner)

        disposable +=
            Observable.empty<Any>()
                .subscribe()

        disposable.size() shouldEqual 1
    }

    @Test
    fun `clears all subscriptions on lifecycle destroy`() {
        val disposable: CompositeDisposable by LifecycleCompositeDisposable(lifeCycleOwner)

        disposable +=
            Observable.empty<Any>()
                .subscribe()

        disposable.size() shouldEqual 1

        lifeCycleOwner.onCreate()
        lifeCycleOwner.onDestroy()

        disposable.size() shouldEqual 0
    }
}
