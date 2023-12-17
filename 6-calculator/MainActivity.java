package com.example.ex6_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double operand1 = 0;
    private double operand2 = 0;
    private String operator = "";

    TextView result;
//    Button badd, bminus, bmul, bdiv, bclear, bequal, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.answer);
        setupButtonClickListener(R.id.button0);
        setupButtonClickListener(R.id.button1);
        setupButtonClickListener(R.id.button2);
        setupButtonClickListener(R.id.button3);
        setupButtonClickListener(R.id.button4);
        setupButtonClickListener(R.id.button5);
        setupButtonClickListener(R.id.button6);
        setupButtonClickListener(R.id.button7);
        setupButtonClickListener(R.id.button8);
        setupButtonClickListener(R.id.button9);
        setupButtonClickListener(R.id.Addbutton);
        setupButtonClickListener(R.id.Minusbutton);
        setupButtonClickListener(R.id.Mulbutton);
        setupButtonClickListener(R.id.Divbutton);
        setupButtonClickListener(R.id.Clearbutton);
        setupButtonClickListener(R.id.Equalbutton);
    }
    private void setupButtonClickListener(int buttonId) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleButtonClick(button.getText().toString());
            }
        });
    }
    private void handleButtonClick(String buttonText) {
        switch (buttonText) {
            case "=" : calculateResult(); break;
            case "C" : clearCalculator(); break;
            case "+" :
            case "-" :
            case "X" :
            case "/" :
                handleOperatorClick(buttonText); break;
            default:
                appendToInput(buttonText); break;
        }
    }
    private void handleOperatorClick(String selectedOperator) {
        if(!result.getText().toString().isEmpty()) {
            operand1 = Double.parseDouble(result.getText().toString());
            operator = selectedOperator;
            result.setText(operand1+operator);
        }
    }
    private void calculateResult() {
        if (!result.getText().toString().isEmpty()) {
            String s=result.getText().toString();
            int i=s.indexOf(operator);
            String op2=s.substring(i+1);
            operand2 = Double.parseDouble(op2);
            double resultValue = 0;

            switch (operator) {
                case "+":
                    resultValue = operand1 + operand2;
                    break;
                case "-":
                    resultValue = operand1 - operand2;
                    break;
                case "X":
                    resultValue = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 != 0) {
                        resultValue = operand1 / operand2;
                    } else {
                        result.setText("Error");
                        return;
                    }
                    break;
            }
            result.setText(String.valueOf(resultValue));
            operand1 = resultValue;
            operator = "";
        }
    }

    private void clearCalculator() {
        operand1 = 0;
        operand2 = 0;
        operator = "";
        result.setText("");
    }
    private void appendToInput(String text) {
        result.append(text);
    }
}