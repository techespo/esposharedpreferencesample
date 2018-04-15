package com.techespo.esposharedpreferencesample;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler = new Handler();
        handler.postDelayed(runnable,3000);
    }

    Runnable runnable =  new Runnable() {
        @Override
        public void run() {

            SharedPreferences spUser = getSharedPreferences("login",0);
           if( spUser.getBoolean("isLogin",false)){
               Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
               startActivity(intent);
               finish();
           }else{
               Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
               startActivity(intent);
               finish();
           }
        }
    };
}
