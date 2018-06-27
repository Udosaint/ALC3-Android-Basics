package com.example.udochukwu.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_detail);
        TextView view = (TextView) findViewById(R.id.schowAnswer);
        TextView views = (TextView) findViewById(R.id.schowfail);
        TextView detail = (TextView) findViewById(R.id.schowdetails);

        int value = getIntent().getIntExtra("correct",0);
        view.setText(String.format("You Have Answered " + value +" Question Out Of 6 Questions"));

        int values = getIntent().getIntExtra("fail",1);
        views.setText(String.format("You Failed " + values +" Question Out Of 6 Questions"));

        String details = getIntent().getStringExtra("details");
        detail.setText("This Is The Overview Result Of The Quiz You Answered \n"  + details );
    }
}
