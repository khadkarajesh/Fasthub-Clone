package com.crushcoder.fasthub.ui.login

import com.crushcoder.fasthub.ui.base.BaseViewModel
import com.crushcoder.fasthub.data.model.User
import com.crushcoder.fasthub.data.service.LoginService
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject

class LoginViewModel @Inject constructor(val service: LoginService) : BaseViewModel() {

    lateinit var data: PublishSubject<State>

    fun login() {
        var authHeader = "Basic".concat(" cmFqZXNoa3VtYXJraGFka2E6UkBqZXNoMTIzNA==")
        service.login(authHeader).subscribe(object : SingleObserver<User> {
            override fun onSubscribe(d: Disposable) {
            }

            override fun onError(e: Throwable) {
            }

            override fun onSuccess(t: User) {
                sayHello()
            }

        })
    }
    fun sayHello(){

    }

    fun String.concat(a: String): String {
        return this.plus(a)
    }
}