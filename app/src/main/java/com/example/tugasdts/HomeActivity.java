package com.example.tugasdts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
    public void input (View view){
        Intent i = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(i);
    }
    public void kalkulator (View view){
        Intent i = new Intent(HomeActivity.this, Kalkulator.class);
        startActivity(i);
    }
    public void listview (View view){
        Intent i = new Intent(HomeActivity.this, LVActivity.class);
        startActivity(i);
    }
}
