package com.example.nike.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nike.ProductDetail;
import com.example.nike.R;
import com.example.nike.model.BestSeller;

import java.util.List;

public class BestSellerRecyclerAdapter extends RecyclerView.Adapter<BestSellerRecyclerAdapter.BestSellerViewHolder> {

    private Context context;
    private List<BestSeller> bestSellerList;

    public BestSellerRecyclerAdapter(Context context, List<BestSeller> bestSellerList) {
        this.context = context;
        this.bestSellerList = bestSellerList;
    }

    @Override
    public BestSellerRecyclerAdapter.BestSellerViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.best_seller_recycler_items, parent, false);
        final BestSellerRecyclerAdapter.BestSellerViewHolder viewHolder = new BestSellerRecyclerAdapter.BestSellerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BestSellerRecyclerAdapter.BestSellerViewHolder holder, final int position) {

        holder.itemName.setText(bestSellerList.get(position).getName());
        holder.price.setText(bestSellerList.get(position).getPrice());
        holder.rating.setText(bestSellerList.get(position).getRating());
        Glide.with(context).load(bestSellerList.get(position).getImageurl()).into(holder.itemImage);

        //ganti halaman brow
        holder.itemView.setOnClickListener((view) -> {

                Intent i = new Intent(context, ProductDetail.class);
                i.putExtra("name", bestSellerList.get(position).getName());
                i.putExtra("rating",bestSellerList.get(position).getRating());
                i.putExtra("price",bestSellerList.get(position).getPrice());
                context.startActivity(i);

        });
    }

    @Override
    public int getItemCount() {

        return bestSellerList.size();
    }

    public static class BestSellerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView itemImage;
        TextView price, rating, itemName;
        LinearLayout linearLayout_best_seller;

        public BestSellerViewHolder(View itemView) {
            super(itemView);

            linearLayout_best_seller = itemView.findViewById(R.id.best_seller);
            itemImage = itemView.findViewById(R.id.shieimageView);
            price = itemView.findViewById(R.id.pricee);
            rating = itemView.findViewById(R.id.rating);
            itemName = itemView.findViewById(R.id.name);

        }

        @Override
        public void onClick(View view){

        }

    }

}
