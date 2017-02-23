package com.example.paul.steelhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        int correct = intent.getExtras().getInt("correct");
        int total = intent.getExtras().getInt("total");
        TextView scoreText = (TextView) findViewById(R.id.score);
        TextView totalText = (TextView) findViewById(R.id.cor);
        String corr = Integer.toString(correct);
        String totals= Integer.toString(total);
        scoreText.setText(corr);
        totalText.setText(totals);
    }

    public void categoryMenu(View button){
        Intent intent = new Intent(this, category.class);
        int mode = 0;
        intent.putExtra("mode", mode);
        startActivity(intent);
    }

    public void mainMenu(View button){
        Intent intent = new Intent(this, MainActivity.class);
        int mode = 0;
        intent.putExtra("mode", mode);
        startActivity(intent);
    }
}
