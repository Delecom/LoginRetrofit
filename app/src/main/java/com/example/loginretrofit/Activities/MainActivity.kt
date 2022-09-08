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

class MainActivity : AppCompatActivity()   {
    var loginLink: TextView? = null
    var name: EditText? = null
    private var email:EditText? = null
    var password:EditText? = null
    var register: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        loginLink = findViewById(R.id.login_link)
        name = findViewById(R.id.name_create)
        email = findViewById(R.id.email_create)
        password = findViewById(R.id.password_create)
        register = findViewById(R.id.btn_register)




    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btn_register -> Toast.makeText(this, "The Id is Register", Toast.LENGTH_SHORT)
                .show()
            R.id.login_link -> switchONLogin()

        }
    }

    private fun switchONLogin() {
        val i = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(i)
    }
}