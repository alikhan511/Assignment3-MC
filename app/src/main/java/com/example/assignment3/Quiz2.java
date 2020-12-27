package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class Quiz2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        TextView textView2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        int count = intent.getIntExtra("Result", -1);
        textView2.setText("Your result is " + count +"/5");
    }
}