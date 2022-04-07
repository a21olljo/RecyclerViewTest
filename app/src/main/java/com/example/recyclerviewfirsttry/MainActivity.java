package com.example.recyclerviewfirsttry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> mountains = Arrays.asList("K2", "Kinnekulle", "Billingen", "Kebenikaise", "Hanneberg", "Hunneberg");

        recyclerView = findViewById(R.id.recycler_view);

    }

}