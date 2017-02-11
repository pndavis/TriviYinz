package com.example.paul.steelhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void single(View button){
        Intent intent = new Intent(this, Instructions.class);
        int mode = 0;
        intent.putExtra("mode", mode);
        startActivity(intent);
    }

    public void multi(View button){
        Intent intent = new Intent(this, Instructions.class);
        int mode = 1;
        intent.putExtra("mode", mode);
        startActivity(intent);
    }


}
