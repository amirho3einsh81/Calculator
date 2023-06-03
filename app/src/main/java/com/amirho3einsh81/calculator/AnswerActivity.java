package com.amirho3einsh81.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        if (getIntent().getExtras() == null)return;

        ((AppCompatTextView) findViewById(R.id.answer)).setText("answer : "+getIntent().getExtras().getFloat("answer"));
    }
}