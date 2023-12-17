package com.example.ex12_optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d("Menu", "onCreateOptionsMenu called");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case (R.id.homee):
//                startActivity(new Intent(this, MainActivity.class));
//                return true;
//            case R.id.aboutt:
//                startActivity(new Intent(this, activity_about.class));
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
        int itemId = item.getItemId();

        if (itemId == R.id.homee) {
            startActivity(new Intent(this, MainActivity.class));
            return true;
        } else if (itemId == R.id.aboutt) {
            startActivity(new Intent(this, activity_about.class));
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }

    }
}