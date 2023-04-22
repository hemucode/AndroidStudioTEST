package com.hemu.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView Custom_listView;
    private String [] Branch_name = {"Cat", "Dog", "Tiger", "Rat", "Cow", "Bat", "Lion"};
    private Integer [] Image_Res = {
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Custom_listView = findViewById(R.id.Custom_list);
        CustomAdopter adopter = new CustomAdopter(this,Branch_name,Image_Res);
        Custom_listView.setAdapter(adopter);

        Custom_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, Branch_name[position], Toast.LENGTH_SHORT).show();
            }
        });


    }

}