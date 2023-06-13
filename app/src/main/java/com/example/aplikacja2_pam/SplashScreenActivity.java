package com.example.aplikacja2_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    private static final long SPLASH_DELAY = 3000; // Opóźnienie w ms
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startMainActivity(); // Przejdź do kolejnej aktywności po opóźnieniu
            }
        }, SPLASH_DELAY);
    }

    private void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish(); // Zamknij aktywność SplashScreen po przejściu do MainActivity
    }
}
