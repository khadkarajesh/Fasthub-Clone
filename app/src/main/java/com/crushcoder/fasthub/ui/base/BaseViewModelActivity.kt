package com.crushcoder.fasthub.ui.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import java.lang.reflect.ParameterizedType


abstract class BaseViewModelActivity<T : ViewModel, B : ViewDataBinding>
    : DaggerAppCompatActivity() {
    lateinit var mViewModel: T
    lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vm = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0]
        mViewModel = ViewModelProviders.of(this).get(vm as Class<T>)
        binding = DataBindingUtil.setContentView(this, getLayout())
    }

    abstract fun getLayout(): Int
}
