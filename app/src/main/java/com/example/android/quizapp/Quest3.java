package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.TextView;

public class Quest3 extends MainActivity {

    RadioButton Ques2Answer1, Ques2Answer2, Ques2Answer3, Ques2Answer4, Ques2rb;
    RadioGroup Ques2rg;
    String Ques2RightAnswer1, Ques2SelectedAnswer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest3);
        Ques2Answer1 = (RadioButton) findViewById(R.id.Ques2answer1);
        Ques2Answer2 = (RadioButton) findViewById(R.id.Ques2answer2);
        Ques2Answer3 = (RadioButton) findViewById(R.id.Ques2answer3);
        Ques2Answer4 = (RadioButton) findViewById(R.id.Ques2answer4);
        Ques2RightAnswer1 = Ques2Answer1.getText().toString();
        Ques2rg = (RadioGroup) findViewById(R.id.rgGroup2);

        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("Result",0);
        score = intValue;
        Button Next1 = (Button) findViewById(R.id.Ques2nextbutton);
        Next1.setOnClickListener(new Button.OnClickListener()

                                {
                                    public void onClick(View View) {

                                        Intent myIntent2 = new Intent(Quest3.this, Quest4.class);
                                        myIntent2.putExtra("Result", score );
                                        startActivity(myIntent2);
                                    }

                                }

        );

    }

    public void rbClick2(View view) {

        int Selected_id= Ques2rg.getCheckedRadioButtonId();
        Ques2rb = (RadioButton) findViewById(Selected_id);
        Ques2SelectedAnswer1 = Ques2rb.getText().toString();
        if (Ques2SelectedAnswer1 == Ques2RightAnswer1)

        {

            Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_LONG).show();
            score=score+1;
        } else

        {
            Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_LONG).show();
        }


    }
}
