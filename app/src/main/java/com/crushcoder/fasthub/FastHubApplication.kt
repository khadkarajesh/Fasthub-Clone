package com.crushcoder.fasthub

import com.crushcoder.fasthub.injection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class FastHubApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}