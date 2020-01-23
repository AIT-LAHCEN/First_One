package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static  final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"La methode onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"La methode onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"La methode onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"La methode onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"La methode onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"La methode onPause");
    }
}
