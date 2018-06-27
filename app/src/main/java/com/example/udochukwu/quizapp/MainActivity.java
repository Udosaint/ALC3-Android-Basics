package com.example.udochukwu.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5, radioGroup6;

    public int Answer = 0;
    public int failed = 0;
    public String detail, d1,d2,d3,d4,d5,d6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup1 = (RadioGroup) findViewById(R.id.rb1);
        radioGroup2 = (RadioGroup) findViewById(R.id.rb2);
        radioGroup3 = (RadioGroup) findViewById(R.id.rb3);
        radioGroup4 = (RadioGroup) findViewById(R.id.rb4);
        radioGroup5 = (RadioGroup) findViewById(R.id.rb5);
        radioGroup6 = (RadioGroup) findViewById(R.id.rb6);
    }


    /*checking for the first question answer*/
    public void getQuestion1(){
        int checkedId = radioGroup1.getCheckedRadioButtonId();
        if (checkedId == R.id.Q1B){
            Answer += 1;
            d1 = "You Got Question 1";
        }else if (checkedId != R.id.Q1A && checkedId != R.id.Q1C && checkedId != R.id.Q1D){
            failed = 0;
            Toast.makeText(this, "empty field", Toast.LENGTH_SHORT).show();
        } else{
            failed +=1;
            d1 = "You failed Question 1";
        }

    }


    /*checking for the second question answer*/
    public void getQuestion2(){
        int checkedId = radioGroup2.getCheckedRadioButtonId();
        if (checkedId == R.id.Q2D){
            Answer += 1;
            d2 = "You Got Question 2";
        }else if (checkedId != R.id.Q2A && checkedId != R.id.Q2C && checkedId != R.id.Q2B){
            failed = 0;
            Toast.makeText(this, "empty field", Toast.LENGTH_SHORT).show();
        } else{
            failed +=1;
            d2 = "You failed Question 2";
        }

    }

    /*checking for the three question answer*/
    public void getQuestion3(){
        int checkedId = radioGroup3.getCheckedRadioButtonId();
        if (checkedId == R.id.Q3B){
            Answer += 1;
            d3 = "You Got Question 3";
        }else if (checkedId != R.id.Q3A && checkedId != R.id.Q3C && checkedId != R.id.Q3D){
            failed = 0;
            Toast.makeText(this, "empty field", Toast.LENGTH_SHORT).show();
        } else{
            failed +=1;
            d3 = "You failed Question 3";
        }

    }

    /*checking for the four question answer*/
    public void getQuestion4(){
        int checkedId = radioGroup4.getCheckedRadioButtonId();
        if (checkedId == R.id.Q4D){
            Answer += 1;
            d4 = "You Got Question 4";
        }else if (checkedId != R.id.Q1A && checkedId != R.id.Q4C && checkedId != R.id.Q4B){
            failed = 0;
            Toast.makeText(this, "empty field", Toast.LENGTH_SHORT).show();
        } else{
            failed +=1;
            d4 = "You failed Question 4";
        }

    }


    /*checking for the first question answer*/
    public void getQuestion5(){
        int checkedId = radioGroup5.getCheckedRadioButtonId();
        if (checkedId == R.id.Q5A){
            Answer += 1;
            d5 = "You Got Question 5";
        }else if (checkedId != R.id.Q5B && checkedId != R.id.Q5C && checkedId != R.id.Q5D){
            failed = 0;
            Toast.makeText(this, "empty field", Toast.LENGTH_SHORT).show();
        } else{
            failed +=1;
            d5 = "You failed Question 5";
        }

    }

    /*checking for the first question answer*/
    public void getQuestion6(){
        int checkedId = radioGroup6.getCheckedRadioButtonId();
        if (checkedId == R.id.Q6C){
            Answer += 1;
            d6 = "You Got Question 6";
        }else if (checkedId != R.id.Q6A && checkedId != R.id.Q6B && checkedId != R.id.Q6D){
            failed = 0;
            Toast.makeText(this, "empty field", Toast.LENGTH_SHORT).show();
        } else{
            failed +=1;
            d6 = "You failed Question 6";
        }

    }


    public void submit(View view){
        getQuestion1();
        getQuestion2();
        getQuestion3();
        getQuestion4();
        getQuestion5();
        getQuestion6();
        detail = "" +d1+ "\n"+d2+ "\n"+d3+ "\n"+d4+ "\n"+d5+ "\n"+d6;
        Intent intent = new Intent(MainActivity.this, ResultDetailActivity.class);
        intent.putExtra("correct", Answer);
        intent.putExtra("fail", failed);
        intent.putExtra("details", detail);
        startActivity(intent);


    }
}
