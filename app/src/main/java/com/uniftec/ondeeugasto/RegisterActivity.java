package com.uniftec.ondeeugasto;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        Button registerButton = (Button) findViewById(R.id.button_register);
        registerButton.setOnClickListener((v) -> {
            signUp();
        });
    }

    public void signUp() {
        TextView emailView = findViewById(R.id.campo_email_registro);
        TextView passwordView = findViewById(R.id.editTextTextPassword);
        CharSequence email = emailView.getText();
        CharSequence password = passwordView.getText();

        if (email.length() == 0 || password.length() == 0) {
            Toast.makeText(RegisterActivity.this, "Digite um email e senha validos",
                    Toast.LENGTH_SHORT).show();
        }
        else {
            mAuth.createUserWithEmailAndPassword(emailView.getText().toString(), passwordView.getText().toString())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                FirebaseUser user = mAuth.getCurrentUser();
                                Intent mainView = new Intent(RegisterActivity.this, MainActivity.class);
                                startActivity(mainView);
                            } else {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(RegisterActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }
}
