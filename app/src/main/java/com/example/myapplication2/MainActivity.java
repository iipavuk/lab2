package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button 1: переход на SecondActivity
        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        // Button 2: переход на ThirdActivity
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(intent);
        });

        // Button 3: переход на FourthActivity
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FourthActivity.class);
            startActivity(intent);
        });

        // Button 4: завершение приложения
        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(v -> finish());
    }
}