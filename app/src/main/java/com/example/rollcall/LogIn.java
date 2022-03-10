package com.example.rollcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        TextView username = (TextView)findViewById(R.id.username);
        TextView password = (TextView)findViewById(R.id.password);




        Button btn = findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(LogIn.this, "Log in successful", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(view.getContext(), MainActivity3.class);
                    startActivity(i);

                }
                else{
                    Toast.makeText(LogIn.this, "Incorrect password or username", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}