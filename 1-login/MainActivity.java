package com.example.ex1_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextText);
        e2 = findViewById(R.id.editTextText2);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username =e1.getText().toString().trim();
                String password = e2.getText().toString().trim();
                if(username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter username and Password", Toast.LENGTH_SHORT).show();
                } else if (username.equals("admin") || password.equals("123")) {
                    Toast.makeText(getApplicationContext(), "You are Logged in!!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}