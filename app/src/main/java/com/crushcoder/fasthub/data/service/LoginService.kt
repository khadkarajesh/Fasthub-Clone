package com.crushcoder.fasthub.data.service

import com.crushcoder.fasthub.data.model.User
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Header


interface LoginService {
    @GET("user")
    fun login(@Header("Authorization") header: String): Single<User>
}