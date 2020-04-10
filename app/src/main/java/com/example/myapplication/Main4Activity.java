package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button btn =  findViewById(R.id.button2);
        Button btn1 = findViewById(R.id.button3);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button2)
        {
            Intent intent = new Intent (Main4Activity.this,Main5Activity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.button3)
        {
            Intent intent = new Intent (Main4Activity.this,Main6Activity.class);
            startActivity(intent);
        }
    }
}
