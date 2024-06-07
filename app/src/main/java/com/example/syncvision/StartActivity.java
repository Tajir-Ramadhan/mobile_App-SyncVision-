package com.example.syncvision;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "StartActivity";  // Define the TAG variable
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        Log.d(TAG, "onCreate: called");

        setContentView(R.layout.activity_start);

        button = findViewById(R.id.button);
        button.setOnClickListener(StartActivity.this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(StartActivity.this, "Please wait ...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(StartActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: called Start Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: called");
    }

}