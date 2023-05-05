package edu.bzu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import entities.Vegetables;

public class VegetablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        Button b1 = findViewById(R.id.button1);
        Vegetables carrot = new Vegetables(b1.getText().toString(),(ImageView) findViewById(R.id.imageView1));
        Button b2 = findViewById(R.id.button2);
        Vegetables pumpkin = new Vegetables(b2.getText().toString(),(ImageView) findViewById(R.id.imageView2));
        Button b3 = findViewById(R.id.button3);
        Vegetables eggplant = new Vegetables(b3.getText().toString(),(ImageView) findViewById(R.id.imageView3));
        Button b4 = findViewById(R.id.button4);
        Vegetables broccoly = new Vegetables(b4.getText().toString(),(ImageView) findViewById(R.id.imageView4));
        Button b5 = findViewById(R.id.button5);
        Vegetables tomato = new Vegetables(b5.getText().toString(),(ImageView) findViewById(R.id.imageView5));


        Vegetables[] vegetables={carrot,pumpkin,eggplant,broccoly,tomato};

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < vegetables.length; i++) {
                    if (vegetables[i].getName().equalsIgnoreCase(b1.getText().toString())) {
                        vegetables[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        vegetables[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < vegetables.length; i++) {
                    if (vegetables[i].getName().equalsIgnoreCase(b2.getText().toString())) {
                        vegetables[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        vegetables[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < vegetables.length; i++) {
                    if (vegetables[i].getName().equalsIgnoreCase(b3.getText().toString())) {
                        vegetables[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        vegetables[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < vegetables.length; i++) {
                    if (vegetables[i].getName().equalsIgnoreCase(b4.getText().toString())) {
                        vegetables[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        vegetables[i].getImg().setVisibility(View.GONE);
                    }
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < vegetables.length; i++) {
                    if (vegetables[i].getName().equalsIgnoreCase(b5.getText().toString())) {
                        vegetables[i].getImg().setVisibility(View.VISIBLE);
                    } else {
                        vegetables[i].getImg().setVisibility(View.GONE);
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