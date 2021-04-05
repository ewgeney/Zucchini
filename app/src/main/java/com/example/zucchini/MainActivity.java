package com.example.zucchini;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    Context context=MainActivity.this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);


        ArrayList<RecycleItem> arrayList = new ArrayList<>();
        arrayList.add(new RecycleItem(R.drawable.image1, collectionOfRecipes.name_1,
                collectionOfRecipes.description_1,collectionOfRecipes.recipe_1));
        arrayList.add(new RecycleItem(R.drawable.image2, collectionOfRecipes.name_2,
                collectionOfRecipes.description_2,collectionOfRecipes.recipe_2));
        arrayList.add(new RecycleItem(R.drawable.image3, collectionOfRecipes.name_3,
                collectionOfRecipes.description_3,collectionOfRecipes.recipe_3));
        arrayList.add(new RecycleItem(R.drawable.image4, collectionOfRecipes.name_4,
                collectionOfRecipes.description_4,collectionOfRecipes.recipe_4));
        arrayList.add(new RecycleItem(R.drawable.image5, collectionOfRecipes.name_5,
                collectionOfRecipes.description_5,collectionOfRecipes.recipe_5));

        adapter = new RecycleAdapter(arrayList, MainActivity.this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


    }
}


