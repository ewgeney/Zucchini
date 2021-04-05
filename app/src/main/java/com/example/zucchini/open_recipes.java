package com.example.zucchini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.zucchini.collectionOfRecipes.*;

public class open_recipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_recipes);
        TextView recipesText = findViewById(R.id.textViewRecipes);
        Intent intent = getIntent();
        recipesText.setText(intent.getStringExtra("recipes"));


    }
}