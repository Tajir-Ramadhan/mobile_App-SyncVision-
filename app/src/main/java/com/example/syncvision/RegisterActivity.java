package com.example.syncvision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    EditText fullName;
    EditText email;
    EditText password;
    EditText confirmedPass;
    Button register;
    TextView loginBtn;
    private static final String Salma = "Register Activity";  // Define the Salma variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Salma,"Create is called");
        setContentView(R.layout.activity_register);

        loginBtn = findViewById(R.id.btnToLogin);
        password = findViewById(R.id.editTextTextPassword);
        confirmedPass = findViewById(R.id.editTextTextPassword2);
        fullName = findViewById(R.id.fullName);
        email = findViewById(R.id.email);
        loginBtn.setOnClickListener(RegisterActivity.this);
//        naming convention of your button: registerBtn
        this.register = findViewById(R.id.register);
        this.register.setOnClickListener(RegisterActivity.this);

    }

    @Override
    public void onClick(View v) {
        // Get the content of the EditText fields
        String name = fullName.getText().toString();
        String emailContent = email.getText().toString();


//        logic for register click
        if (v.getId() == R.id.register) {
            if (password.getText().toString().equals(confirmedPass.getText().toString())) {
                // Display the content in a toast message
                Toast.makeText(RegisterActivity.this, "Hello " + name + " Your password matches", Toast.LENGTH_SHORT).show();
            } else {
                // Display the content in a toast message
                Toast.makeText(RegisterActivity.this, "Your name is " + name + " and your email is " + emailContent + ". Unfortunately your password mismatch!", Toast.LENGTH_LONG).show();
            }
        } else {
            //                logic for login click


            Toast.makeText(RegisterActivity.this, "Back to login " + name + "." , Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
        }


    }

    protected void onStart() {
        super.onStart();
        Log.d(Salma, "onStart: called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Salma, "onResume: called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Salma, "onPause: called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Salma, "onStop: called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Salma, "onDestroy: called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Salma, "onRestart: called");
    }
}