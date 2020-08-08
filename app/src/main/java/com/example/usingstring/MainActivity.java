package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.logging.LoggingMXBean;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);


        Log.i("Lifecycle", "OnCreate called.....");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecylce", "OnStart called....");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Lifecylce", "OnResume called....");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecylce", "OnPause called....");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecylce", "OnStop called....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecylce", "OnDestroy called....");
    }


}