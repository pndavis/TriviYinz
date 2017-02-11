package com.example.paul.steelhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void single(View button){
        Intent intent = new Intent(this, instructions.class);
        int mode = 0;
        intent.putExtra("mode", mode);
        startActivity(intent);
    }

    public void multi(View button){

    }


}
