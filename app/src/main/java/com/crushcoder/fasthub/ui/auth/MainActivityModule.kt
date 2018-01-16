package com.crushcoder.fasthub.ui.auth

import com.crushcoder.fasthub.data.service.LoginService
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    fun provideViewModel(service: LoginService): MainActivityViewModel {
        return MainActivityViewModel(service)
    }
}
