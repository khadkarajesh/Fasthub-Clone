package com.crushcoder.fasthub.ui.auth

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    fun provideViewModel(): MainActivityViewModel {
        return MainActivityViewModel()
    }
}
