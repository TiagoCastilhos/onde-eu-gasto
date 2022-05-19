package com.uniftec.ondeeugasto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = (Button) findViewById(R.id.botao_logar_login);
        loginButton.setOnClickListener((v) -> {
            Intent mainView = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(mainView);
        });

        TextView registerButton = (TextView) findViewById(R.id.registrar_login);
        registerButton.setOnClickListener((v) -> {
            Intent registerView = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(registerView);
        });
    }
}
