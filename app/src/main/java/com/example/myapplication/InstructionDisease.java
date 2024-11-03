package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InstructionDisease extends AppCompatActivity {
    private Button btnGotIt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructiondisease);

        btnGotIt1 = findViewById(R.id.btn_got_it);
        btnGotIt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start DetectDisease after acknowledging the instructions
                Intent intent = new Intent(InstructionDisease.this, DetectDisease.class);
                startActivity(intent);
                finish();
            }
        });

        // Instructions Text
        TextView instructionText = findViewById(R.id.instruction_text);
        instructionText.setText("NOTE:" +
                "\n\nPlease capture ONLY an image of a mango leaf one at a time." +
                "\n\nAlso, make sure to provide a good lighting and white background before capturing for better identification of anthracnose disease.");
    }
}
