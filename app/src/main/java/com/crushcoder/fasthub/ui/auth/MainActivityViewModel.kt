package com.crushcoder.fasthub.ui.auth

import android.arch.lifecycle.ViewModel
import android.util.Base64
import android.util.Log
import com.crushcoder.fasthub.data.model.User
import com.crushcoder.fasthub.data.service.LoginService
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class MainActivityViewModel @Inject constructor(val service: LoginService) : ViewModel() {

    fun getUserDetails(): String {
        return "hello world"
    }

    fun encode(data: String): String {
        return Base64.encodeToString(data.toByteArray(), Base64.DEFAULT)
    }

    fun login() {
        //var authHeader = "Basic "+encode("rajeshkumarkhadka:R@jesh1234")
        var authHeader = "Basic cmFqZXNoa3VtYXJraGFka2E6UkBqZXNoMTIzNA=="
        service.login(authHeader)
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