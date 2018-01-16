package com.crushcoder.fasthub.ui.auth

import android.content.Intent
import android.os.Bundle
import com.crushcoder.fasthub.R
import com.crushcoder.fasthub.base.BaseActivity
import com.crushcoder.fasthub.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {
    @Inject lateinit var viewModel: MainActivityViewModel

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main_tv_login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
