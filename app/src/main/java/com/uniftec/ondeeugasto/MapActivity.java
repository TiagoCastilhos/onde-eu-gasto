package com.uniftec.ondeeugasto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uniftec.ondeeugasto.navigation.Navigator;

public class MapActivity extends AppCompatActivity {

    private Navigator navigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        this.navigator = new Navigator(MapActivity.this);
    }
}