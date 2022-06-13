package com.cookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.cookingapp.allRecipes.AllRecipesActivity;

public class MainActivity extends AppCompatActivity {
    private LinearLayout allRecipesLL, mostViewedLL, addNewRecipeLL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allRecipesLL = findViewById(R.id.activity_main_ll_all_recipes);
        mostViewedLL = findViewById(R.id.activity_main_ll_most_viewed);
        addNewRecipeLL = findViewById(R.id.activity_main_ll_add_new_recipe);

        allRecipesLL.setOnClickListener(r -> openActivity("allRecipes"));
        mostViewedLL.setOnClickListener(r -> openActivity("mostViewed"));
        addNewRecipeLL.setOnClickListener(r -> openActivity("addNewRecipe"));

    }

    private void openActivity(String activityName) {
        Intent intent;

        switch (activityName) {
            case "allRecipes":
                intent = new Intent(MainActivity.this, AllRecipesActivity.class);
                startActivity(intent);
                break;
            case "mostViewed":
                intent = new Intent(MainActivity.this, MostViewedActivity.class);
                startActivity(intent);
                break;
            case "addNewRecipe":
                intent = new Intent(MainActivity.this, AddNewRecipeActivity.class);
                startActivity(intent);
                break;
        }
    }
}