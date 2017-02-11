package com.example.paul.steelhacks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Intent intent = getIntent();
    }

    public void geography(View button){
        Intent intent = new Intent(this, Game.class);
        int cat = 0;
        intent.putExtra("cat", cat);
        startActivity(intent);
    }

    public void sports (View button){
        Intent intent = new Intent(this, Game.class);
        int cat = 1;
        intent.putExtra("cat", cat);
        startActivity(intent);
    }

    public void inventions (View button){
        Intent intent = new Intent(this, Game.class);
        int cat = 2;
        intent.putExtra("cat", cat);
        startActivity(intent);
    }

    public void misc (View button){
        Intent intent = new Intent(this, Game.class);
        int cat = 3;
        intent.putExtra("cat", cat);
        startActivity(intent);
    }
}
