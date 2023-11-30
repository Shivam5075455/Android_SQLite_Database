package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent;
                SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
                Boolean check = sharedPreferences.getBoolean("flag", false);

                if(check){
                    intent = new Intent(MainActivity.this, HomeActivity.class);
                }else{
                    intent = new Intent(MainActivity.this, LoginActivity.class);
                }
                startActivity(intent);
            }
        }, 1000);

    }
}