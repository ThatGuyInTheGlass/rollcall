package com.example.rollcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                Toast.makeText(SignUp.this, "Sign up successful", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(view.getContext(), MainActivity3.class);
                startActivity(i);
            }
        });
    }
}