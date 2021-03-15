package com.example.nike;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetail extends AppCompatActivity {
    TextView pName, pPrice, pRating;
    ImageView backButton,like;
    Button buyNow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String price = i.getStringExtra("price");
        String rating = i.getStringExtra("rating");

        pName = findViewById(R.id.prod_name);
        pPrice =  findViewById(R.id.priceS);
        pRating = findViewById(R.id.ratingg);
        backButton = findViewById(R.id.back_button);
        buyNow = findViewById(R.id.buy_button);
        like = findViewById(R.id.like_button);

        pName.setText(name);
        pRating.setText(rating);
        pPrice.setText(price);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProductDetail.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductDetail.this,"harga produk = "+price,Toast.LENGTH_SHORT).show();
            }
        });
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductDetail.this,"produk masuk ke wishlist",Toast.LENGTH_SHORT).show();

            }
        });

    }
}