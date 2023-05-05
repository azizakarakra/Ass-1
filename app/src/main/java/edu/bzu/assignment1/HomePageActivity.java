package edu.bzu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void fruits(View view) {
        Intent intent = new Intent(this, FruitsActivity.class);
        startActivity(intent);
    }

    public void vegetables(View view) {
        Intent intent = new Intent(this,VegetablesActivity.class);
        startActivity(intent);
    }



    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void animals(View view) {
        Intent intent = new Intent(this,AnimalsActivity.class);
        startActivity(intent);
    }
}