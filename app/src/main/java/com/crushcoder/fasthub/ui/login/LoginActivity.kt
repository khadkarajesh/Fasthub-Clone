package com.crushcoder.fasthub.ui.login

import android.os.Bundle
import com.crushcoder.fasthub.R
import com.crushcoder.fasthub.base.BaseViewModelActivity
import com.crushcoder.fasthub.databinding.ActivityLoginBinding

class LoginActivity : BaseViewModelActivity<LoginViewModel, ActivityLoginBinding>() {
    override fun getLayout(): Int {
        return R.layout.activity_login
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
