package com.crushcoder.fasthub

import android.app.Activity
import android.app.Application
import com.crushcoder.fasthub.injection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class FastHubApplication : Application(), HasActivityInjector {
    @Inject lateinit var injector: DispatchingAndroidInjector<Activity>
    override fun activityInjector(): AndroidInjector<Activity> {
        return injector
    }

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }
}