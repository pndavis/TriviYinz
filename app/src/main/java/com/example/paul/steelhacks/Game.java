package com.example.paul.steelhacks;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.FileNotFoundException;

public class Game extends AppCompatActivity {
    int score = 0;
    int total = 0;
    int time = 0;
    double startTime = -1;
    int categ;
    QuestionsManager manager = null;
    Questions question = null;
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    TextView countDown;
    TextView questionText;
    Intent intent1= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        final Intent intent = getIntent();
        categ = intent.getExtras().getInt("cat");
        countDown = (TextView) findViewById(R.id.countDown);
        questionText = (TextView) findViewById(R.id.question);
        option1 = (Button) findViewById(R.id.choice1);
        option2 = (Button) findViewById(R.id.choice2);
        option3 = (Button) findViewById(R.id.choice3);
        option4 = (Button) findViewById(R.id.choice4);
        intent1 = new Intent(this, Result.class);


        //File implementation -- to be fixed
        String filename = "";
        switch(categ){
            case 0: filename = "Geography";break;
            case 1: filename = "Sports";break;
            case 2: filename = "inventions";break;
            case 3: filename = "Misc";break;
        }
        try {
            manager = new QuestionsManager(filename);
        }
        catch(FileNotFoundException fnfe){
            System.out.println("ERROR: FILE NOT FOUND");
        }

        Handler handle = new Handler();
        handle.postDelayed(new Runnable(){
            @Override
            public void run() {
                intent1.putExtra("correct", score);
                intent1.putExtra("total", total);
                startActivity(intent1);
            }
        }, 20000);
        changeQuestion();

        new CountDownTimer(21000, 1000) {


            public void onTick ( long millisUntilFinished){
                countDown.setText("" + millisUntilFinished / 1000);
            }
            public void onFinish() {
                countDown.setText("done!");
            }
        }.start();

    }


    public void changeQuestion(){
        total++;
        option1.setBackgroundColor(Color.DKGRAY);
        option2.setBackgroundColor(Color.DKGRAY);
        option3.setBackgroundColor(Color.DKGRAY);
        option4.setBackgroundColor(Color.DKGRAY);
        question = manager.getQuestion();
        questionText.setText(question.getQuestion());
        option1.setText(question.getOption1());
        option2.setText(question.getOption2());
        option3.setText(question.getOption3());
        option4.setText(question.getOption4());
    }

    public void buttonA(View button) {
        // if correct answer was this index, increment total
        // reload strings
        if (question.getAnswer() == 0) {
            option1.setBackgroundColor(Color.GREEN);
            score++;
        }
        else {
            option1.setBackgroundColor(Color.RED);
        }
        Handler handle = new Handler();
        handle.postDelayed(new Runnable(){
            @Override
            public void run() {
                changeQuestion();
            }
        }, 200);
    }

    public void buttonB(View button) {
        // if correct answer was this index, increment total
        // reload strings
        if (question.getAnswer() == 1) {
            option2.setBackgroundColor(Color.GREEN);
            score++;
        }
        else {
            option2.setBackgroundColor(Color.RED);
        }
        Handler handle = new Handler();
        handle.postDelayed(new Runnable(){
            @Override
            public void run() {
                changeQuestion();
            }
        }, 200);
    }

    public void buttonC(View button) {
        // if correct answer was this index, increment total
        // reload strings
        if (question.getAnswer() == 2) {
            option3.setBackgroundColor(Color.GREEN);
            score++;
        }
        else {
            option3.setBackgroundColor(Color.RED);
        }
        Handler handle = new Handler();
        handle.postDelayed(new Runnable(){
            @Override
            public void run() {
                changeQuestion();
            }
        }, 200);
    }

    public void buttonD(View button) {
        // if correct answer was this index, increment total
        // reload strings
        if (question.getAnswer() == 3) {
            option4.setBackgroundColor(Color.GREEN);
            score++;
        }
        else {
            option4.setBackgroundColor(Color.RED);
        }
        Handler handle = new Handler();
        handle.postDelayed(new Runnable(){
            @Override
            public void run() {
                changeQuestion();
            }
        }, 200);
    }

}
