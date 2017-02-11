package com.example.paul.steelhacks;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game extends AppCompatActivity {
    int score = 0;
    int time = 0;
    double startTime = -1;
    int categ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        final Intent intent = getIntent();
        categ = intent.getExtras().getInt("cat");

        new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    while(true) {
                        TextView t = (TextView) findViewById(R.id.question);
                        Button option1 = (Button) findViewById(R.id.choice1);
                        Button option2 = (Button) findViewById(R.id.choice2);
                        Button option3 = (Button) findViewById(R.id.choice3);
                        Button option4 = (Button) findViewById(R.id.choice4);

                        t.setText("Hello losers");
                        option1.setText("Lenny");
                        option2.setText("Paul");
                        option3.setText("Ryan");
                        option4.setText("Dva");

                        option3.setBackgroundColor(Color.GREEN);
                    }
                }

                public void buttonA(View button) {
                    // if correct answer was this index, increment total
                    // reload strings
                }
            }, 2000);
        }



}
