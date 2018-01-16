package com.crushcoder.fasthub.di

import com.crushcoder.fasthub.ui.auth.MainActivity
import com.crushcoder.fasthub.ui.auth.MainActivityModule
import com.crushcoder.fasthub.ui.login.LoginActivity
import com.crushcoder.fasthub.ui.login.LoginActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = arrayOf(LoginActivityModule::class))
    abstract fun bindLoginActivity(): LoginActivity
}