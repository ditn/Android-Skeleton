package com.adambennett.moduleandroid

import com.adambennett.testutils.rxjava.lifecycle.TestLifecycleOwner
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.plusAssign
import org.amshove.kluent.`should equal`
import org.junit.Test

class LifecycleCompositeDisposableTest {

    private val lifeCycleOwner = TestLifecycleOwner()

    @Test
    fun `can add subscriptions`() {
        val disposable: CompositeDisposable by LifecycleCompositeDisposable(lifeCycleOwner)
        disposable +=
            Observable.empty<Any>()
                .subscribe()

        disposable.size() `should equal` 1
    }

    @Test
    fun `clears all subscriptions on lifecycle destroy`() {
        val disposable: CompositeDisposable by LifecycleCompositeDisposable(lifeCycleOwner)
        disposable +=
            Observable.empty<Any>()
                .subscribe()

        disposable.size() `should equal` 1

        lifeCycleOwner.onCreate()
        lifeCycleOwner.onDestroy()

        disposable.size() `should equal` 0
    }
}
