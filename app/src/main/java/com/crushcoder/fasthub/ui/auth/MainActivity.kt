package com.crushcoder.fasthub.ui.auth

import android.content.Intent
import android.os.Bundle
import com.crushcoder.fasthub.R
import com.crushcoder.fasthub.base.BaseActivity
import com.crushcoder.fasthub.ui.login.LoginActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {
    @Inject lateinit var viewModel: MainActivityViewModel

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        //viewModel.login()
    }
}
