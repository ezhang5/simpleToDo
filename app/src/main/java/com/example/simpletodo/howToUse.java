package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class howToUse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_use);

        Button returnHome;
        EditText instructionTitle;
        TextView listInstructions;

        returnHome = findViewById(R.id.returnHome);
        instructionTitle = findViewById(R.id.instructionTitle);
        listInstructions = findViewById(R.id.listInstructions);

        getSupportActionBar().setTitle("How To Use To-Do List");

        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(howToUse.this, MainActivity.class));
            }
        });

    }
}