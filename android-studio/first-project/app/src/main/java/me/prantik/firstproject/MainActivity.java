package me.prantik.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    Button ok;
    TextView result;
    ImageView image;
    RadioGroup radioGroup;
    RadioButton green;
    RadioButton red;
    RadioButton yellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.linear);
        ok = findViewById(R.id.buttonOk);
        result = findViewById(R.id.textViewResult);
        image = findViewById(R.id.imageView);

        radioGroup = findViewById(R.id.group);
        green = findViewById(R.id.radioButtonGreen);
        red = findViewById(R.id.radioButtonRed);
        yellow = findViewById(R.id.radioButtonYellow);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(green.isChecked()) {
                    layout.setBackgroundColor(Color.GREEN);
                } else if(red.isChecked()) {
                    layout.setBackgroundColor(Color.RED);
                } else if(yellow.isChecked()) {
                    layout.setBackgroundColor(Color.YELLOW);
                }
            }
        });
    }
}