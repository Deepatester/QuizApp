package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;



public class Quest2 extends MainActivity {

    RadioButton Answer1, Answer2, Answer3, Answer4, rb;
    RadioGroup rg;
    String RightAnswer1, SelectedAnswer1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest2);
        Answer1 = (RadioButton) findViewById(R.id.answer1);
        Answer2 = (RadioButton) findViewById(R.id.answer2);
        Answer3 = (RadioButton) findViewById(R.id.answer3);
        Answer4 = (RadioButton) findViewById(R.id.answer4);
        RightAnswer1 = Answer2.getText().toString();
        rg = (RadioGroup) findViewById(R.id.rgGroup);

        Button Next = (Button) findViewById(R.id.nextbutton);
        Next.setOnClickListener(new Button.OnClickListener()

                                {
                                    public void onClick(View View) {

                                        Intent myIntent1 = new Intent(Quest2.this, Quest3.class);
                                        myIntent1.putExtra("Result",score);
                                        startActivity(myIntent1);
                                    }

                                }

        );

    }

    public void rbClick(View v) {

        int Selected_id= rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(Selected_id);
        SelectedAnswer1 = rb.getText().toString();
        if (SelectedAnswer1 == RightAnswer1)

        {

            Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_LONG).show();
            score=score+1;
        } else

        {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_LONG).show();
        }
    }
}






