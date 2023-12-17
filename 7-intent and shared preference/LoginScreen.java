package com.example.ex7_intent_and_sharedprefernece;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    public void login(View view) {
        SharedPreferences preferences = getSharedPreferences("credentials", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("userName", ((EditText)findViewById(R.id.userName)).getText().toString());
        editor.apply();
        startActivity(new Intent(this, MainActivity.class));
    }
}
