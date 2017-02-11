package com.example.paul.steelhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent intent = getIntent();
        TextView t = (TextView) findViewById(R.id.question);
        if(intent.getExtras().getInt("cat") == 0){
            t.setText("HELLO ZENYATTA!"); // retrieve the questions from file
        }
        else if(intent.getExtras().getInt("cat")== 1){
            t.setText("HELLO DVA!!");
        }
        else if(intent.getExtras().getInt("cat")== 2){
            t.setText("HELLO PHARAH!!");
        }
        else if(intent.getExtras().getInt("cat")== 3){
            t.setText("HELLO WIDOWMAKER!!");
        }
    }


}
