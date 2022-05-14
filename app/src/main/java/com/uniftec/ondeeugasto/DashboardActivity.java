package com.uniftec.ondeeugasto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uniftec.ondeeugasto.navigation.Navigator;

public class DashboardActivity extends AppCompatActivity {

    private Navigator navigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        this.navigator = new Navigator(DashboardActivity.this);
    }
}