package com.example.rollcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Roll.class);
                startActivity(i);
            }
        });


        Button btn1 = findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Rules.class);
                startActivity(i);
            }
        });

        Button btn2 = findViewById(R.id.button4);
        btn2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HighScores.class);
                startActivity(i);
            }
        });
    }
}