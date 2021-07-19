package me.prantik.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ok;
    TextView result;
    ImageView image;
    CheckBox male;
    CheckBox female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = findViewById(R.id.buttonOk);
        result = findViewById(R.id.textViewResult);
        image = findViewById(R.id.imageView);
        male = findViewById(R.id.checkBoxMale);
        female = findViewById(R.id.checkBoxFemale);

        male.setOnClickListener(view -> {
            if (male.isChecked()) {
                result.setText("Male");
                female.setChecked(false);
            } else {
                result.setText("What is your gender?");
            }
        });
        female.setOnClickListener(view -> {
            if (female.isChecked()) {
                result.setText("Female");
                male.setChecked(false);
            } else {
                result.setText("What is your gender?");
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.mountain);
            }
        });
    }
}