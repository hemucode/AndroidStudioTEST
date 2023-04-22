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
    WebView webView;


//  <uses-permission android:name="android.permission.INTERNET"></uses-permission>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.Web_Page);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://www.codehemu.com/");
        WebViewClient webViewClient = new WebViewClient();
        webView.setWebViewClient(webViewClient);
    }
    public void onBackPressed(){
        if (webView.canGoBack()){
            webView.goBack();
        }
        else
            super.onBackPressed();
    }
}