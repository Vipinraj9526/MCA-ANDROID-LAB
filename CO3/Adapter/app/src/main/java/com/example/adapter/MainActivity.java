package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview=new ListView(this);
        String[] sports={"soccer","cricket","rugby"};
        ArrayAdapter<String> sportsAdapter=new ArrayAdapter<String>(MainActivity.this,R.layout.activity_main,R.id.textView,sports);
        setContentView(listview);
        listview.setAdapter(sportsAdapter);
    }
}