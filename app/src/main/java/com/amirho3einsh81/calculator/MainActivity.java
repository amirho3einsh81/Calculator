package com.amirho3einsh81.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatTextView compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compute = findViewById(R.id.compute);
    }

    float avvaly=0, dovvomy = 0, answer = 0;
    String s = "";

    public void onClick(View view) {

        String simple = (String) view.getTag();
        if (simple.contains("+") || simple.contains("-") || simple.contains("*") || simple.contains("/")) {
//        int id = (int) view.getTag();
            switch (simple) {
                case "+":
                    s = "+";
                    break;
                case "-":
                    s = "-";
                    break;
                case "*":
                    s = "*";
                    break;
                case "/":
                    s = "/";
                    break;
                default:
                    break;
            }
//
            avvaly = Float.parseFloat(compute.getText().toString());
            compute.setText("");

        } else if (simple.contains("=")) {
//
            dovvomy = Float.parseFloat(compute.getText().toString());
            switch (s) {
                case "+":
                    answer = avvaly + dovvomy;
                    break;
                case "-":
                    answer = avvaly - dovvomy;
                    break;
                case "*":
                    answer = avvaly * dovvomy;
                    break;
                case "/":
                    answer = avvaly / dovvomy;
                    break;
                default:
                    break;
            }
            Intent i = new Intent(this , AnswerActivity.class);
            i.putExtra("answer" , answer);
            startActivity(i);
        } else if (simple.contains("c")) {
            s ="";
            compute.setText("0");
        } else {
            compute.append(simple);
        }
    }
}