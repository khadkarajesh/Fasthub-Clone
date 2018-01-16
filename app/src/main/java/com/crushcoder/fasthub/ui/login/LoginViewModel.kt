package com.crushcoder.fasthub.ui.login

import android.util.Log
import com.crushcoder.fasthub.base.BaseViewModel
import com.crushcoder.fasthub.data.model.User
import com.crushcoder.fasthub.data.service.LoginService
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class LoginViewModel @Inject constructor(service: LoginService) : BaseViewModel() {
    val loginService = service

    fun login() {
        var authHeader = "Basic cmFqZXNoa3VtYXJraGFka2E6UkBqZXNoMTIzNA=="
        loginService.login(authHeader)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : SingleObserver<User> {
                    override fun onError(e: Throwable) {
                        Log.d("success", "" + e.localizedMessage)
                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onSuccess(t: User) {
                        Log.d("success", "" + t.name)
                    }
                })
    }
}