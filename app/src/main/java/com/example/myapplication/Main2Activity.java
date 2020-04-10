package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<String> sel = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void selectItem(View v)
    {
        boolean chk = ((CheckBox) v).isChecked();
        switch(v.getId()) {
            case R.id.checkBox:
                if (chk)
                    sel.add("Cough");
                else
                    sel.remove("Cough");
                break;
            case R.id.checkBox1:
                if (chk)
                    sel.add("Fever");
                else
                    sel.remove("Fever");
                break;
            case R.id.checkBox2:
                if (chk)
                    sel.add("Tiredness");
                else
                    sel.remove("Tiredness");
                break;
            case R.id.checkBox3:
                if (chk)
                    sel.add("Difficulty Breathing");
                else
                    sel.remove("Difficulty Breathing");
                break;
        }
        }
        @RequiresApi(api = Build.VERSION_CODES.N)
        public void selection(View v)
        {
            if(sel.stream().count()<4)
            {
                Intent intent1 = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent1);
            }
            else if(sel.stream().count()==4)
            {
                Intent intent2 = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent2);
        }

        }
    }

