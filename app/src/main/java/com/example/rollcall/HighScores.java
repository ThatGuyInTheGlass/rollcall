package com.example.rollcall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class HighScores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);

        ImageView one = (ImageView) findViewById(R.id.imageView);
        ImageView two = (ImageView) findViewById(R.id.imageView2);
        ImageView three = (ImageView) findViewById(R.id.imageView3);

        one.setImageResource(R.drawable.player);
        two.setImageResource(R.drawable.player);
        three.setImageResource(R.drawable.player);





    }
}