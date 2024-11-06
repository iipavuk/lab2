package com.example.myapplication2;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        // Custom button with border and color change on press
        Button customButton = findViewById(R.id.custom_button);
        GradientDrawable border = new GradientDrawable();
        border.setCornerRadius(24);
        border.setStroke(4, 0xFF505050);  // Border thickness based on birth month
        border.setColor(0xFFFFFFFF);  // White background
        customButton.setBackground(border);

        customButton.setOnClickListener(v -> {
            // Change button color on press
            border.setColor(0xFF90EE90);  // Light green color
        });
    }
}