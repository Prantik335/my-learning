package me.prantik.applicationlifecycle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.time.LocalTime;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AppLifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate [ " + now()+ " ]");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy [ " + now()+ " ]");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop [ " + now()+ " ]");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart [ " + now()+ " ]");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume [ " + now()+ " ]");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause [ " + now()+ " ]");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart [ " + now()+ " ]");
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