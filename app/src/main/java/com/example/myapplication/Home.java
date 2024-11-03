package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;

public class Home extends AppCompatActivity {
    private Button button;   // Disease Detection
    private Button button2;  // Another detection
    private Button button3;  // Information button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start Instruction Activity
                Intent intent = new Intent(Home.this, InstructionDisease.class);
                startActivity(intent);
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, InstructionLeaf.class);
                startActivity(intent);
            }
        });

        // Initialize button3 and set the OnClickListener
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Information.class);
                startActivity(intent);
            }
        });
    }

    // Asks the user whether they want to exit the app or not.
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton(android.R.string.yes, (dialog, which) -> {
                    finishAffinity(); // Close all activities and exit
                    System.exit(0);  // Ensures the app exits completely
                })
                .setNegativeButton(android.R.string.no, null)
                .show();
    }
}