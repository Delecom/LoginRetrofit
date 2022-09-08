package com.example.loginretrofit.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.loginretrofit.R

class LoginActivity : AppCompatActivity() {
    var registerlink: TextView? = null
    private var email: EditText? = null
    var password: EditText? = null
    var login: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        registerlink = findViewById(R.id.register_lint)
        email = findViewById(R.id.email_login)
        password = findViewById(R.id.password_create)
        login = findViewById(R.id.btn_login)

    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btn_register -> Toast.makeText(this, "The Id is Register", Toast.LENGTH_SHORT)
                .show()
            R.id.login_link -> switchONRegister()
        }
    }

    private fun switchONRegister() {
        val i = Intent(this@LoginActivity, LoginActivity::class.java)
        startActivity(i)
    }
}