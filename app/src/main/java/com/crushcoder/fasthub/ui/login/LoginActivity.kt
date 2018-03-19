package com.crushcoder.fasthub.ui.login

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.crushcoder.fasthub.R
import com.rromer.exemple.infrastructure.di.ViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    lateinit var loginViewModel: LoginViewModel
    @Inject
    lateinit var factory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginViewModel = ViewModelProviders.of(this, factory).get(LoginViewModel::class.java)
    }
}
