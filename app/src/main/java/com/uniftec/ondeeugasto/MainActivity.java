package com.uniftec.ondeeugasto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uniftec.ondeeugasto.navigation.Navigator;

public class MainActivity extends AppCompatActivity {

    private Navigator navigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.navigator = new Navigator(MainActivity.this);
    }
}