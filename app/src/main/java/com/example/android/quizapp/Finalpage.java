package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Finalpage extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalpage);
        Intent mIntent3 = getIntent();
        int intValue = mIntent3.getIntExtra("Result",0);
        score = intValue;
    }
    public void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.finalView2);
        scoreView.setText(String.valueOf(score));
            }
     public void calculateScore(View view){
     displayScore(score);
     }
}