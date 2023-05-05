package edu.bzu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;

import entities.Fruits;

public class FruitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        Button b1 = findViewById(R.id.button1);
        Fruits apple = new Fruits(b1.getText().toString(), (ImageView) findViewById(R.id.imageView1));
        Button b2 = findViewById(R.id.button2);
        Fruits grapes = new Fruits(b2.getText().toString(), (ImageView) findViewById(R.id.imageView2));
        Button b3 = findViewById(R.id.button3);
        Fruits orange = new Fruits(b3.getText().toString(), (ImageView) findViewById(R.id.imageView3));
        Button b5 = findViewById(R.id.button5);
        Fruits strawberry = new Fruits(b5.getText().toString(),(ImageView) findViewById(R.id.imageView4));
        Button b6 = findViewById(R.id.button6);
        Fruits watermelon = new Fruits(b6.getText().toString(),(ImageView) findViewById(R.id.imageView5));
        Fruits[] fruits = {apple, grapes, orange,strawberry,watermelon};


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < fruits.length; i++) {
                    if (fruits[i].getName().equalsIgnoreCase(b1.getText().toString())) {
                        fruits[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        fruits[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < fruits.length; i++) {
                    if (fruits[i].getName().equalsIgnoreCase(b2.getText().toString())) {
                        fruits[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        fruits[i].getImg().setVisibility(View.GONE);
                    }
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < fruits.length; i++) {
                    if (fruits[i].getName().equalsIgnoreCase(b3.getText().toString())) {
                        fruits[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        fruits[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < fruits.length; i++) {
                    if (fruits[i].getName().equalsIgnoreCase(b5.getText().toString())) {
                        fruits[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        fruits[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < fruits.length; i++) {
                    if (fruits[i].getName().equalsIgnoreCase(b6.getText().toString())) {
                        fruits[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        fruits[i].getImg().setVisibility(View.GONE);
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