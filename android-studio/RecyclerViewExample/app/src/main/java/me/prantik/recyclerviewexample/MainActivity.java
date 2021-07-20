package me.prantik.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    private ArrayList<String> countryNameList = new ArrayList<>();
    private ArrayList<String> detailList = new ArrayList<>();
    private ArrayList<Integer> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        countryNameList.add("United Kingdom");
        countryNameList.add("Germany");
        countryNameList.add("USA");

        detailList.add("This is the United Kingdom Flag");
        detailList.add("This is the Germany Flag");
        detailList.add("This is the USA Flag");

        imageList.add(R.drawable.unitedkingdom);
        imageList.add(R.drawable.germany);
        imageList.add(R.drawable.usa);

        adapter = new RecyclerAdapter(countryNameList, detailList, imageList, this);
        recyclerView.setAdapter(adapter);
    }
}