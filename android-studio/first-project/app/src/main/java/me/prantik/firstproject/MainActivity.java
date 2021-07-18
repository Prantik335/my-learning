package me.prantik.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myText;
    Button magicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = findViewById(R.id.myText);

        myText.setTextColor(Color.BLACK);
        myText.setText("My name is Prnatik");
        myText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myText.setTextColor(Color.WHITE);
                myText.setBackgroundColor(Color.BLACK);
            }
        });

        magicButton = findViewById(R.id.domagic);

        magicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                magicButton.setBackgroundColor(Color.BLACK);
                myText.setText("I am a programmer.");
                myText.setVisibility(View.INVISIBLE);
            }
        });

    }
}