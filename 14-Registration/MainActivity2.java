package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.textView2);
        t1.setText("Name: " + getIntent().getStringExtra("username") + "\nPassword: "+ getIntent().getStringExtra("password") + "\nGender: " + getIntent().getStringExtra("gender") + "\nHobby: " + getIntent().getStringExtra("hobby"));
    }
}