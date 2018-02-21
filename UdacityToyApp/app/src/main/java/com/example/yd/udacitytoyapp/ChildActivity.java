package com.example.yd.udacitytoyapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    // COMPLETED (6) Create a TextView field to display your message
    /* Field to store our TextView */
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        // COMPLETED (7) Get a reference to your TextView in Java
        /* Typical usage of findViewById... */
        mDisplayText = (TextView) findViewById(R.id.tv_display);
    }

}
