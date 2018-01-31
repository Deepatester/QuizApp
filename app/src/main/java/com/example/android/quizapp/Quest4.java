package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quest4 extends MainActivity {

    RadioButton Ques3Answer1, Ques3Answer2, Ques3Answer3, Ques3Answer4, Ques3rb;
    RadioGroup Ques3rg;
    String Ques3RightAnswer1, Ques3SelectedAnswer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest4);

        Ques3Answer1 = (RadioButton) findViewById(R.id.Ques3answer1);
        Ques3Answer2 = (RadioButton) findViewById(R.id.Ques3answer2);
        Ques3Answer3 = (RadioButton) findViewById(R.id.Ques3answer3);
        Ques3Answer4 = (RadioButton) findViewById(R.id.Ques3answer4);
        Ques3RightAnswer1 = Ques3Answer1.getText().toString();
        Ques3rg = (RadioGroup) findViewById(R.id.rgGroup3);
        Intent mIntent1 = getIntent();
        int intValue = mIntent1.getIntExtra("Result",0);
        score = intValue;
        Button Next3 = (Button) findViewById(R.id.Ques3nextbutton);
        Next3.setOnClickListener(new Button.OnClickListener()

                                {
                                    public void onClick(View View) {

                                        Intent myIntent3 = new Intent(Quest4.this, Quest5.class);
                                        myIntent3.putExtra("Result", score );
                                        startActivity(myIntent3);
                                    }

                                }

        );

    }

    public void rbClick3(View view) {

        int Selected_id= Ques3rg.getCheckedRadioButtonId();
        Ques3rb = (RadioButton) findViewById(Selected_id);
        Ques3SelectedAnswer1 = Ques3rb.getText().toString();
        if (Ques3SelectedAnswer1 == Ques3RightAnswer1)

        {

            Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_LONG).show();
            score=score+1;
        } else

        {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_LONG).show();
        }


    }
}
