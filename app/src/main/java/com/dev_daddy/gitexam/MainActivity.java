package com.dev_daddy.gitexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Hello World");
        Log.d(TAG, "Project Diva");
        Log.d(TAG, "Project Rock");
        Log.d(TAG, "Master");
        Log.d(TAG, "Hello! Local repository");
        Log.d(TAG, "Hello! git pull");
    }
}
