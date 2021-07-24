package me.prantik.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    MyBroadcast myBroadcast = new MyBroadcast();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyBroadcast", "onStart");

        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        registerReceiver(myBroadcast, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyBroadcast", "onStop");
//        unregisterReceiver(myBroadcast);
    }
}