package com.example.webforest.mathgame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnPlay = (Button)findViewById(R.id.buttonPlay);
        btnPlay.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this,GameActivity.class);
        startActivity(i);

    }
}
