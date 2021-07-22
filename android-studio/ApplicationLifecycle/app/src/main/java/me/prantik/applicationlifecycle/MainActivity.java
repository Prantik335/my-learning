package me.prantik.applicationlifecycle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalTime;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AppLifecycle";
    String prefix = "First Activity ";
    TextView textView;
    Button plus1;
    Button button2;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        plus1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        plus1.setOnClickListener(view -> {
            textView.setText(++counter + "");
        });

        button2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        Log.d(TAG, prefix + "onCreate [ " + now()+ " ]");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, prefix + "onDestroy [ " + now()+ " ]");
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, prefix + "onStop [ " + now()+ " ]");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, prefix + "onStart [ " + now()+ " ]");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, prefix + "onResume [ " + now()+ " ]");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, prefix + "onPause [ " + now()+ " ]");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, prefix + "onRestart [ " + now()+ " ]");
    }

    private String now() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return LocalTime.now().toString();
        } else {
            return "!support";
        }
    }

    private void doo() {
        for (int i = 0; i < 10; i++) {
            Toast.makeText(this, "i = " + i, Toast.LENGTH_SHORT)
                    .show();
        }
    }
}