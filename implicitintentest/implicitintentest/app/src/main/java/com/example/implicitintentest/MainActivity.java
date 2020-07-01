package com.example.implicitintentest;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openURL(View view) {
        Uri u =Uri.parse("https://www.google.com");
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }

    public void call(View view) {
        Uri u =Uri.parse("tel:1234567890");
        Intent i = new Intent(Intent.ACTION_DIAL,u);
        startActivity(i);
    }



    public void myLocation(View view) {
        Uri mapsuri = Uri.parse("geo:16.4649,80.5078");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapsuri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }

    }
}