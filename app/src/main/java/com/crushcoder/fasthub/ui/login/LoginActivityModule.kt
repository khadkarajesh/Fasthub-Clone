package com.crushcoder.fasthub.ui.login

import com.crushcoder.fasthub.data.service.LoginService
import dagger.Module
import dagger.Provides

@Module
class LoginActivityModule {
    @Provides
    fun provideViewModel(service: LoginService): LoginViewModel {
        return LoginViewModel(service)
    }
}
