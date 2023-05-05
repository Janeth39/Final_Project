package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.header_pink));
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        nextBtn = (Button) findViewById(R.id.nxtBttn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openActivityNext();
            }
        });

    }
    public void openActivityNext() {
        Intent intent = new Intent(this, first.class);
        startActivity(intent);
    }
}