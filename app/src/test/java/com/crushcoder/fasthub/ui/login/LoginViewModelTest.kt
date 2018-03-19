package com.crushcoder.fasthub.ui.login

import com.crushcoder.fasthub.data.model.User
import com.crushcoder.fasthub.data.service.LoginService
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import io.reactivex.Single
import org.junit.Before
import org.junit.Test


class LoginViewModelTest {
    lateinit var loginViewModel: LoginViewModel
    var loginService: LoginService? = null
    lateinit var user: User
    @Before
    fun setup() {
        loginService = mock()
        loginViewModel = LoginViewModel(loginService!!)
        user = mock()
    }

    @Test
    fun should_login_success() {
        whenever(loginService?.login("rajeshkumarkhadka")).thenReturn(Single.just(user))
        loginViewModel.login()
        verify(loginViewModel).sayHello()
    }
}