package com.signnd.aplikasita3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button enter, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scanLaunch();
            }
        });

        about = findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               aboutLaunch();
            }
        });

    }

    private void scanLaunch() {
        Intent scan = new Intent(this, ScanActivity.class);
        startActivity(scan);
    }

    private void aboutLaunch() {
        Intent about = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(about);
    }

}