package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quest5 extends MainActivity {
    RadioButton Ques4Answer1, Ques4Answer2, Ques4Answer3, Ques4Answer4, Ques4rb;
    RadioGroup Ques4rg;
    String Ques4RightAnswer1, Ques4SelectedAnswer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest5);


        Ques4Answer1 = (RadioButton) findViewById(R.id.Ques4answer1);
        Ques4Answer2 = (RadioButton) findViewById(R.id.Ques4answer2);
        Ques4Answer3 = (RadioButton) findViewById(R.id.Ques4answer3);
        Ques4Answer4 = (RadioButton) findViewById(R.id.Ques4answer4);
        Ques4RightAnswer1 = Ques4Answer1.getText().toString();
        Ques4rg = (RadioGroup) findViewById(R.id.rgGroup4);

        Intent mIntent2 = getIntent();
        int intValue = mIntent2.getIntExtra("Result",0);
        score = intValue;
        Button Next4 = (Button) findViewById(R.id.Ques4nextbutton);
        Next4.setOnClickListener(new Button.OnClickListener()

                                 {
                                     public void onClick(View View) {

                                         Intent myIntent4 = new Intent(Quest5.this, Finalpage.class);
                                         myIntent4.putExtra("Result", score );
                                         startActivity(myIntent4);
                                     }

                                 }

        );

    }

    public void rbClick4(View view) {

        int Selected_id= Ques4rg.getCheckedRadioButtonId();
        Ques4rb = (RadioButton) findViewById(Selected_id);
        Ques4SelectedAnswer1 = Ques4rb.getText().toString();
        if (Ques4SelectedAnswer1 == Ques4RightAnswer1)

        {

            Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_LONG).show();
            score=score+1;
        } else

        {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_LONG).show();
        }


    }
}
