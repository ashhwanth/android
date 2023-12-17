package com.example.ex4_checkboxsum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox c1, c2, c3;
    Button b1;
    TextView t1;
    int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        b1 = findViewById(R.id.button);
        t1 = findViewById(R.id.textView);


    setCheckBoxListeners();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateSum();
            }
        });
    }

    private void setCheckBoxListeners() {
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                calculateSum();
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                calculateSum();
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                calculateSum();
            }
        });
    }

    private void calculateSum() {
        if (!b1.isPressed()) {
            return;
        }

        int chk1 = c1.isChecked() ? Integer.parseInt(c1.getText().toString()) : 0;
        int chk2 = c2.isChecked() ? Integer.parseInt(c2.getText().toString()) : 0;
        int chk3 = c3.isChecked() ? Integer.parseInt(c3.getText().toString()) : 0;

        sum = chk1 + chk2 + chk3;
        t1.setText("Sum : " + sum);
    }
}