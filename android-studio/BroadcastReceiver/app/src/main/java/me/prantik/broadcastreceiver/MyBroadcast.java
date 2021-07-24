package me.prantik.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {
    private static final String TAG = "MyBroadcast";

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean isAirplaneMode = intent.getBooleanExtra("state", false);

        if(isAirplaneMode) {
            Toast.makeText(context, "Device is in Airplane mode", Toast.LENGTH_LONG)
                    .show();
        } else {
            Toast.makeText(context, "Device is not in Airplane mode", Toast.LENGTH_LONG)
                    .show();
        }
        Log.d(TAG, "onReceive: " + isAirplaneMode);
    }
}
