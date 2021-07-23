package me.prantik.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonStart;
    Button buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.startButton);
        buttonStop = findViewById(R.id.stopButton);

        buttonStart.setOnClickListener(view -> {
            Intent intent = new Intent(this, MyService.class);
            startService(intent);
        });

        buttonStop.setOnClickListener(view -> {
            Intent intent = new Intent(this, MyService.class);
            stopService(intent);
        });
    }
}