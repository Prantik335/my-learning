package me.prantik.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        fillArray();

        GridAdapter adapter = new GridAdapter(this, names, images);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(MainActivity.this, "You selected " + names.get(i), Toast.LENGTH_SHORT)
                    .show();
        });
    }

    public void fillArray() {
        names.add("Bird");
        names.add("Cat");
        names.add("Chicken");
        names.add("Dog");
        names.add("Fish");
        names.add("Monkey");
        names.add("Rabbit");
        names.add("Sheep");
        names.add("Lion");

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                images.add(R.drawable.img2);
            } else {
                images.add(R.drawable.img1);
            }
        }
    }
}