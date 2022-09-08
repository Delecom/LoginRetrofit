package com.example.loginretrofit.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginretrofit.R;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    TextView loginLink;
    EditText name,email,password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        loginLink = findViewById(R.id.login_link);
        name = findViewById(R.id.name_create);
        email = findViewById(R.id.email_create);
        password = findViewById(R.id.password_create);
        register = findViewById(R.id.btn_login);

        loginLink.setOnClickListener(this);
        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case  R.id.btn_register:
                Toast.makeText(this,"The Id is Register",Toast.LENGTH_SHORT).show();
                break;
            case R.id.register_lint:
                switchONLogin();
                break;

        }

    }

    private void switchONLogin() {
        Intent i = new Intent(MainActivity2.this,LoginActivity.class);
        startActivity(i);
    }
}