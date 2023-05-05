package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.header));
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}