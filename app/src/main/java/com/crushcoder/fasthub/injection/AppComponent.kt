package com.crushcoder.fasthub.injection

import com.crushcoder.fasthub.FastHubApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules =
arrayOf(AppModule::class,
        AndroidSupportInjectionModule::class,
        ActivityBuildersModule::class))
interface AppComponent : AndroidInjector<FastHubApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<FastHubApplication>()
}