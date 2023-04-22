package com.hemu.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView1,autoCompleteTextView2;
    private ImageView imageView1,imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView1 = findViewById(R.id.autoComplete_TextView);
        autoCompleteTextView2 = findViewById(R.id.autoComplete_TextView2);

        imageView1 = findViewById(R.id.image_drop);
        imageView2 = findViewById(R.id.image_drop2);

        String [] category = {"Flower", "Fruits", "animal"};
        String [] Flower = {"Rose", "Lotus", "Dahlia"};
        String [] Fruits = {"Apple", "Mango", "Banana"};
        String [] animal = {"Cow", "Cat", "Dog"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, category);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Flower);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Fruits);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, animal);
        autoCompleteTextView1.setAdapter(adapter1);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autoCompleteTextView1.showDropDown();
            }
        });

        autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        autoCompleteTextView2.setAdapter(adapter2);
                        imageView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView2.showDropDown();
                            }
                        });
                        break;
                    case 1:
                        autoCompleteTextView2.setAdapter(adapter3);
                        imageView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView2.showDropDown();
                            }
                        });
                        break;

                    case 2:
                        autoCompleteTextView2.setAdapter(adapter4);
                        imageView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView2.showDropDown();
                            }
                        });
                        break;

                }
            }
        });



    }
}