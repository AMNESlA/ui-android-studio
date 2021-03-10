package com.example.nike;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nike.adapter.NewReleaseRecyclerAdapter;
import com.example.nike.model.NewRelease;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    NewReleaseRecyclerAdapter newReleaseRecyclerAdapter;
    List<NewRelease> newReleaseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nike);

        recyclerView = findViewById(R.id.recyclerView);

        newReleaseList = new ArrayList<>();

        NewRelease product1 = new NewRelease("","","","");
        NewRelease product2 = new NewRelease("","","","");
        NewRelease product3 = new NewRelease("","","","");
        NewRelease product4 = new NewRelease("","","","");
        NewRelease product5 = new NewRelease("","","","");

        newReleaseList.add(product1);
        newReleaseList.add(product2);
        newReleaseList.add(product3);
        newReleaseList.add(product4);
        newReleaseList.add(product5);

        newReleaseRecyclerAdapter = new NewReleaseRecyclerAdapter(this, newReleaseList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(newReleaseRecyclerAdapter);
        newReleaseRecyclerAdapter.notifyDataSetChanged();

    }
}