package com.uniftec.ondeeugasto.navigation;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.uniftec.ondeeugasto.DashboardActivity;
import com.uniftec.ondeeugasto.LoginActivity;
import com.uniftec.ondeeugasto.MapActivity;
import com.uniftec.ondeeugasto.R;

public class Navigator {
    private AppCompatActivity callerActivity;

    public Navigator(AppCompatActivity callerActivity) {
        BottomAppBar bottomAppBar = callerActivity.findViewById(R.id.bottomAppBar);

        bottomAppBar.setOnMenuItemClickListener(item -> goTo(callerActivity, item.getItemId()));
    }

    public static boolean goTo(AppCompatActivity caller, int menuItemId) {
        Intent intent;

        switch (menuItemId) {
            case R.id.dashboard:
                intent = new Intent(caller, DashboardActivity.class);
                caller.startActivity(intent);
                return true;
            case R.id.map:
                intent = new Intent(caller, MapActivity.class);
                caller.startActivity(intent);
                return true;
            case R.id.login:
                intent = new Intent(caller, LoginActivity.class);
                caller.startActivity(intent);
                return true;
        }

        return false;
    }
}
