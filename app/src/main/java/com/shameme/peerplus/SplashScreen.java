package com.shameme.peerplus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        Thread mThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1000);
                    startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        setContentView(R.layout.activity_splash_screen);
        mThread.start();

    }
}