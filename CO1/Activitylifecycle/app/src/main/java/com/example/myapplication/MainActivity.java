package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("state","Oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("state","Onstart");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("state","Onrestart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("state","Onresume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("state","Onpause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("state","Onstop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("state","Ondestroy");

    }
}