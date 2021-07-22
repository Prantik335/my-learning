package me.prantik.iksnake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.GridView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    int numOfRows;
    DisplayMetrics displayMetrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.playground);
        displayMetrics = getResources().getDisplayMetrics();
        int size = displayMetrics.widthPixels / 10;
        numOfRows = displayMetrics.heightPixels / size - 2;

        GridAdapter adapter = new GridAdapter(this, numOfRows, size);
        gridView.setAdapter(adapter);
    }
}