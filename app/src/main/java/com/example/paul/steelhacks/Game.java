package com.example.paul.steelhacks;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;

public class Game extends AppCompatActivity {
    int score = 0;
    int time = 0;
    double startTime = -1;
    int categ;
    QuestionsManager manager = null;
    Questions question = null;
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        final Intent intent = getIntent();
        categ = intent.getExtras().getInt("cat");
        t = (TextView) findViewById(R.id.question);
        option1 = (Button) findViewById(R.id.choice1);
        option2 = (Button) findViewById(R.id.choice2);
        option3 = (Button) findViewById(R.id.choice3);
        option4 = (Button) findViewById(R.id.choice4);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                String filename = "";
                switch(categ){
                    case 0: filename = "Geography";break;
                    case 1: filename = "Sports";break;
                    case 2: filename = "Inventions";break;
                    case 3: filename = "Misc";break;
                }
                try {
                    manager = new QuestionsManager(filename);
                }
                catch(FileNotFoundException fnfe){
                    System.out.println("ERROR: FILE NOT FOUND");
                }
                while(true) {
                    System.out.println("HELLO IT WORKS YOU GOOF");
                    question = manager.getQuestion();
                    t.setText(question.getQuestion());
                    option1.setText(question.getOption1());
                    option2.setText(question.getOption2());
                    option3.setText(question.getOption3());
                    option4.setText(question.getOption4());

                }
            }


        }, 20000);
    }

    public void buttonA(View button) {
        // if correct answer was this index, increment total
        // reload strings
        if(question.getAnswer() == 0) {
            option1.setBackgroundColor(Color.GREEN);
            score ++;
        }
    }



}
