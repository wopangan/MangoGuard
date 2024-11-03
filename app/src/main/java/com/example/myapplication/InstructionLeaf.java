package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InstructionLeaf extends AppCompatActivity {
    private Button btnGotIt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructionleaf);

        btnGotIt2 = findViewById(R.id.btn_got_it);
        btnGotIt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start DetectDisease after acknowledging the instructions
                Intent intent = new Intent(InstructionLeaf.this, DetectLeaf.class);
                startActivity(intent);
                finish();
            }
        });

        // Instructions Text
        TextView instructionText = findViewById(R.id.instruction_text);
        instructionText.setText("NOTE:" +
                "\n\nPlease capture ONLY an image of a Carabao or Indian mango leaf one at a time." +
                "\n\nAlso, make sure to provide a good lighting and white background before capturing for better identification.");
    }
}
