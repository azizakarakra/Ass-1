package edu.bzu.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        RecyclerView recycler = findViewById(R.id.pizza_recycler);
        String[] captions = new String[Food.foods.length];
        int[] ids = new int[Food.foods.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Food.foods[i].getName();
            ids[i] = Food.foods[i].getImageID();
        }

        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}