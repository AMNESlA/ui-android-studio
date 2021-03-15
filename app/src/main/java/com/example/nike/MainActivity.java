package com.example.nike;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nike.adapter.BestSellerRecyclerAdapter;
import com.example.nike.adapter.NewReleaseRecyclerAdapter;
import com.example.nike.model.BestSeller;
import com.example.nike.model.NewRelease;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView,bestSellerRecyclerView;
    NewReleaseRecyclerAdapter newReleaseRecyclerAdapter;
    BestSellerRecyclerAdapter bestSellerRecyclerAdapter;
    List<NewRelease> newReleaseList;
    List<BestSeller> bestSellerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportActionBar().setHomeButtonEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nike);

        recyclerView = findViewById(R.id.recyclerView);
        bestSellerRecyclerView = findViewById(R.id.best_seller_recycler);

        newReleaseList = new ArrayList<>();
        bestSellerList = new ArrayList<>();

        NewRelease product1 = new NewRelease("patu basket","https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/nikestore/shoe1.png","Mens Shoe","300.000","4.5");
        NewRelease product2 = new NewRelease("patu basket","https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/nikestore/shoe2.png","Mens Shoe","300.000","4.1");
        NewRelease product3 = new NewRelease("patu basket","https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/nikestore/shoe3.png","Mens Shoe","300.000","4.4");
        NewRelease product4 = new NewRelease("patu basket","https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/nikestore/shoe4.png","Mens Shoe","300.000","4.2");
        NewRelease product5 = new NewRelease("patu basket","https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/nikestore/shoe5.png","Mens Shoe","300.000","4.2");

        newReleaseList.add(product1);
        newReleaseList.add(product2);
        newReleaseList.add(product3);
        newReleaseList.add(product4);
        newReleaseList.add(product5);

        BestSeller bestSeller1 = new BestSeller("patu putsal 1","https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/nikestore/small_shoe1.png","4.9","Rp. 450.000");
        BestSeller bestSeller2 = new BestSeller("patu putsal 2","https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/nikestore/small_shoe2.png","4.9","Rp. 450.000");
        BestSeller bestSeller3 = new BestSeller("patu putsal 3","https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/nikestore/small_shoe3.png","4.9","Rp. 450.000");
        BestSeller bestSeller4 = new BestSeller("patu putsal 4","https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/nikestore/small_shoe4.png","4.9","Rp. 450.000");
        BestSeller bestSeller5 = new BestSeller("patu putsal 5","https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/nikestore/small_shoe5.png","4.9","Rp. 450.000");

        bestSellerList.add(bestSeller1);
        bestSellerList.add(bestSeller2);
        bestSellerList.add(bestSeller3);
        bestSellerList.add(bestSeller4);
        bestSellerList.add(bestSeller5);

        newReleaseRecyclerAdapter = new NewReleaseRecyclerAdapter(this, newReleaseList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(newReleaseRecyclerAdapter);
        newReleaseRecyclerAdapter.notifyDataSetChanged();

        bestSellerRecyclerAdapter = new BestSellerRecyclerAdapter(this,bestSellerList);
        bestSellerRecyclerView.setHasFixedSize(true);
        bestSellerRecyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        bestSellerRecyclerView.setAdapter(bestSellerRecyclerAdapter);
        bestSellerRecyclerAdapter.notifyDataSetChanged();

    }
}