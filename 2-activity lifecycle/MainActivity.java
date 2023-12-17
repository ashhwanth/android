package com.example.ex2_activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity lifecycle", "onStart: Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity lifecycle", "onResume: Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity lifecycle", "onPause: Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity lifecycle", "onStop: Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity lifecycle", "onRestart: Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity lifecycle", "onDestroy: Called");
    }
}