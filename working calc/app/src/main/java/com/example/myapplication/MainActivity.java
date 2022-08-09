package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calc = findViewById(R.id.bc);
        EditText number1 = findViewById(R.id.N1);
        EditText number2 = findViewById(R.id.N2);
        TextView total = findViewById(R.id.result);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int result = num1 + num2;
                total.setText(String.valueOf(result));

            }
        });

    }
}