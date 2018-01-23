package com.crushcoder.fasthub.ui.login

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.crushcoder.fasthub.R
import com.crushcoder.fasthub.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {
    override fun getLayout(): Int {
        return R.layout.activity_login
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        floatingActionButton2.setOnClickListener {
            val username = login_til_username.editText?.text
            val passowrd = login_til_password.editText?.text
        }

        login_til_password.editText?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                when {
                    s.isNullOrEmpty() -> login_til_password.error = "Password cant be empty"
                    s?.length?.compareTo(10)!! < 0 -> login_til_password.error = "invalid password"
                    else -> show("Success")
                }
            }

        })
    }

    fun Activity.show(message: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, message, length).show()
    }
}
