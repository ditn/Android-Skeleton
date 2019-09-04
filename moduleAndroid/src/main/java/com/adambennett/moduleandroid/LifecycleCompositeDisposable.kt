package com.adambennett.moduleandroid

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import io.reactivex.disposables.CompositeDisposable
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LifecycleCompositeDisposable(
    lifecycleOwner: LifecycleOwner
) : ReadOnlyProperty<Any?, CompositeDisposable>, LifecycleObserver {

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    init {
        lifecycleOwner.lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private fun destroy() {
        compositeDisposable.clear()
    }

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): CompositeDisposable = compositeDisposable
}
