package com.example.zucchini;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleHolder> {
    ArrayList<RecycleItem> arrayList;
    Context context;


    public class RecycleHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView image;
        public TextView text1;
        public TextView text2;


        public RecycleHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            image = itemView.findViewById(R.id.imageView);
            text1 = itemView.findViewById(R.id.text1);
            text2 = itemView.findViewById(R.id.text2);

        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, open_recipes.class);
            RecycleItem recycleItem = arrayList.get(getAdapterPosition());
            intent.putExtra("recipes", recycleItem.getRecipes());
            context.startActivity(intent);
        }
    }
    public RecycleAdapter (ArrayList<RecycleItem> arrayList, Context context){
        this.arrayList=arrayList;
        this.context=context;
    }
    @NonNull
    @Override
    public  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View wtfView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item, parent, false);
        RecycleHolder recycleHolder = new RecycleHolder(wtfView);
        return recycleHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleHolder holder, final int position) {
        final RecycleItem recycleItem = arrayList.get(position);
        holder.image.setImageResource(recycleItem.getImageView());
        holder.text1.setText(recycleItem.getText1());
        holder.text2.setText(recycleItem.getText2());

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
