package com.uniftec.ondeeugasto;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registerButton = (Button) findViewById(R.id.button_register);
        registerButton.setOnClickListener((v) -> {
            Intent mainView = new Intent(RegisterActivity.this, MainActivity.class);
            startActivity(mainView);
        });
    }
}
