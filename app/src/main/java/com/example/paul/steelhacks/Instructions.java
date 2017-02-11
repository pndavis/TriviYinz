package com.example.paul.steelhacks;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        Intent intent = getIntent();

    }

    @Override
    public boolean onTouchEvent(MotionEvent e){
        if(e.getAction() == MotionEvent.ACTION_DOWN){
            Intent intent = new Intent(this, category.class);
            int cat = 0;
            intent.putExtra("mode", cat);
            startActivity(intent);
        }
        return super.onTouchEvent(e);
    }
}
