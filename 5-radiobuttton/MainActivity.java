package com.example.ex5_radiobutton;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    Button displayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        displayButton = findViewById(R.id.displayButton);

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();

                if (selectedRadioButtonId != -1) {
                    RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
                    String selectedState = selectedRadioButton.getText().toString();
                    displayCapital(selectedState);
                } else {
                    Toast.makeText(getApplicationContext(), "Please select a state", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void displayCapital(String state) {
        String capital = getCapital(state);
        Toast.makeText(getApplicationContext(), "Capital of " + state + ": " + capital, Toast.LENGTH_LONG).show();
    }

    private String getCapital(String state) {
        switch (state) {
            case "Kerala":
                return "Thiruvananthapuram";
            case "Tamil Nadu":
                return "Chennai";
            case "Goa":
                return "Panaji";
            default:
                return "Unknown";
        }
    }
}
