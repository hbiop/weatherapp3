package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Settings extends AppCompatActivity implements View.OnClickListener {
EditText city;
Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        city = (EditText) findViewById(R.id.editTextTextPersonName);
        search = (Button) findViewById(R.id.search);
        search.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.search:
                Intent intent = new Intent(this, MainActivity.class);
                String extra = city.getText().toString();
                intent.putExtra("city", extra);
                startActivity(intent);
        }
    }
}