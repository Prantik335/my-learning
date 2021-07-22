package me.prantik.applicationlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.time.LocalTime;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "AppLifecycle";
    String prefix = "Second Activity ";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.button3);

        button.setOnClickListener(view -> {
            Intent i = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(i);
        });

        Log.d(TAG, prefix + "onCreate [ " + now()+ " ]");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, prefix + "onDestroy [ " + now()+ " ]");
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