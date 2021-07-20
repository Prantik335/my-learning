package me.prantik.recycleviewmytest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout;
    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    ArrayList<String> nameList = new ArrayList<>();
    ArrayList<String> bioList = new ArrayList<>();
    ArrayList<Integer> profileImgList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        nameList.add("Prantik");
        bioList.add("I'm Prantik. I'am a programmer.");
        profileImgList.add(R.drawable.prantik);

        nameList.add("Riyad");
        bioList.add("I'm Riyad. I am a student.");
        profileImgList.add(R.drawable.riyad);

        adapter = new RecyclerAdapter(this, nameList, bioList, profileImgList, layout);
        recyclerView.setAdapter(adapter);
    }
}