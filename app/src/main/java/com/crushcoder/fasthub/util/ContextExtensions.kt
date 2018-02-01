package com.crushcoder.fasthub.util

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide


fun Context.show(message: String, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, length).show()
}

fun ImageView.load(url: String) {
    Glide.with(context).load(url).into(this)
}