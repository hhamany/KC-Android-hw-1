package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView cal = findViewById(R.id.cal);
        TextView result = findViewById(R.id.result);
        EditText quiz = findViewById(R.id.quiz);
        EditText hw = findViewById(R.id.homework);
        EditText med = findViewById(R.id.midterm);
        EditText finals = findViewById(R.id.finals);
        Button calc = findViewById(R.id.calc);
        Button reset = findViewById(R.id.reset);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Scanner input = new Scanner(System.in);

                int a = Integer.parseInt(quiz.getText().toString());
                int b = Integer.parseInt(hw.getText().toString());
                int c = Integer.parseInt(med.getText().toString());
                int d = Integer.parseInt(finals.getText().toString());
                int x = a+b+c+d ;

                float presenatage = x * 100/500;
                result.setText(Integer.toString((int) presenatage));
                System.out.println(presenatage);


            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (EditText editText : Arrays.asList(quiz, hw, med, finals)) {
                    editText.setText(null);
                }


            }
        });

    }
}