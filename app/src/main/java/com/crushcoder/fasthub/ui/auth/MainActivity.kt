package com.crushcoder.fasthub.ui.auth

import android.os.Bundle
import android.util.Log
import com.crushcoder.fasthub.R
import com.crushcoder.fasthub.base.BaseActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : BaseActivity() {
    @Inject lateinit var viewModel: MainActivityViewModel

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        viewModel.getUserDetails()
        Log.d("details", viewModel.getUserDetails())
    }
}
