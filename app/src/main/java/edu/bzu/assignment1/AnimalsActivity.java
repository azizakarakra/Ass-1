package edu.bzu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import entities.Animals;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        Button b1 = findViewById(R.id.button1);
        Animals lion = new Animals(b1.getText().toString(),(ImageView) findViewById(R.id.imageView1));

        Button b2 = findViewById(R.id.button2);
        Animals cat = new Animals(b2.getText().toString(),(ImageView) findViewById(R.id.imageView2));

        Button b3 = findViewById(R.id.button3);
        Animals dog = new Animals(b3.getText().toString(),(ImageView) findViewById(R.id.imageView3));

        Button b4 = findViewById(R.id.button4);
        Animals fish = new Animals(b4.getText().toString(),(ImageView) findViewById(R.id.imageView4));

        Button b5 = findViewById(R.id.button5);
        Animals zebra = new Animals(b5.getText().toString(),(ImageView) findViewById(R.id.imageView5));

        Animals[] animals = {lion,cat,dog,fish,zebra};

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < animals.length; i++) {
                    if (animals[i].getName().equalsIgnoreCase(b1.getText().toString())) {
                        animals[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        animals[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < animals.length; i++) {
                    if (animals[i].getName().equalsIgnoreCase(b2.getText().toString())) {
                        animals[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        animals[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < animals.length; i++) {
                    if (animals[i].getName().equalsIgnoreCase(b3.getText().toString())) {
                        animals[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        animals[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < animals.length; i++) {
                    if (animals[i].getName().equalsIgnoreCase(b4.getText().toString())) {
                        animals[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        animals[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < animals.length; i++) {
                    if (animals[i].getName().equalsIgnoreCase(b5.getText().toString())) {
                        animals[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        animals[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
    }

}