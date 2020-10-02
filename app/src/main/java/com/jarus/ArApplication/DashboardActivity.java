package com.jarus.ArApplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.LinearLayout;


public class DashboardActivity extends AppCompatActivity {
LinearLayout mainlayout, quit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    mainlayout = findViewById(R.id.arlook);
    quit= findViewById(R.id.exit);


    mainlayout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent= new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        }
    });


        quit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });



    }




}
