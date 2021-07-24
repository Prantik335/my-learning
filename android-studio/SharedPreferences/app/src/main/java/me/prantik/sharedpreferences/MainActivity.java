package me.prantik.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText userMessage;
    Button counter;
    CheckBox remember;
    int count = 0;
    String name;
    String message;
    boolean isChecked;

    SharedPreferences sharedPreferences;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.editTextName);
        userMessage = findViewById(R.id.editTextMessage);
        counter = findViewById(R.id.buttonCounter);
        remember = findViewById(R.id.checkBox);

        counter.setOnClickListener(view -> {
            count++;
            counter.setText("" + count);
        });

        retrieveData();
    }

    @Override
    protected void onPause() {
        saveData();
        super.onPause();
    }

    public void saveData() {
        sharedPreferences = getSharedPreferences("saveData", Context.MODE_PRIVATE);

        name = userName.getText().toString();
        message = userMessage.getText().toString();
        isChecked = remember.isChecked();

        @SuppressLint("CommitPrefEdits")
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", name);
        editor.putString("message", message);
        editor.putInt("count", count);
        editor.putBoolean("remember", isChecked);
        editor.apply();
        Toast.makeText(this, "Your data is saved", Toast.LENGTH_SHORT)
                .show();
    }

    public void retrieveData() {
        sharedPreferences = getSharedPreferences("saveData", Context.MODE_PRIVATE);

        name = sharedPreferences.getString("name", null);
        message = sharedPreferences.getString("message", null);
        count = sharedPreferences.getInt("count", 0);
        isChecked = sharedPreferences.getBoolean("remember", false);

        userName.setText(name);
        userMessage.setText(message);
        counter.setText(count + "");
        remember.setChecked(isChecked);
    }
}