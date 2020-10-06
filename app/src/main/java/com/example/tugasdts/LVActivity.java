package com.example.tugasdts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LVActivity extends AppCompatActivity {


    ListView lvData;
    private String[] data = new String[]{
            "Indonesia","Malaysia","Singapura", "Kamboja","China","Korea","Jepang","Thailand","Brunei Darussalam","Laos"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv);
        lvData = findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(LVActivity.this, android.R.layout.simple_list_item_1, data);
        lvData.setAdapter(adapter);
        lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(LVActivity.this, data[i] , Toast.LENGTH_LONG).show();
            }
        });
    }
    }