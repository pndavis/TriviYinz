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
        TextView t = (TextView) findViewById(R.id.score);


    }
}
