package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.view.View.*;

public class Main5Activity extends AppCompatActivity{
    ListView l;
    List lt = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        l = findViewById(R.id.list);
        lt.add("Andhra Pradesh");
        lt.add("Arunachal Pradesh");
        lt.add("Assam");
        lt.add("Bihar");
        lt.add("Chhattisgarh");
        lt.add("Goa");
        lt.add("Gujarat");
        lt.add("Haryana");
        lt.add("Himachal Pradesh");
        lt.add("Jharkhand");
        lt.add("Karnataka");
        lt.add("Kerela");
        lt.add("Madhya Pradesh");
        lt.add("Maharashtra");
        lt.add("Manipur");
        lt.add("Meghalaya");
        lt.add("Mizoram");
        lt.add("Nagaland");
        lt.add("Odisha");
        lt.add("Punjab");
        lt.add("Rajasthan");
        lt.add("Sikkim");
        lt.add("Tamil Nadu");
        lt.add("Telanga");
        lt.add("Tripura");
        lt.add("Uttarakhand");
        lt.add("Uttar Pradesh");
        lt.add("West Bengal");
        lt.add("Andaman and Nicobar Islands");
        lt.add("Chandigarh");
        lt.add("Dadra and Nagar Haveli and Daman & Due");
        lt.add("Delhi");
        lt.add("Jammu & Kashmir");
        lt.add("Ladakh");
        lt.add("Lakshadweep");
        lt.add("Puducherry");

        adapter = new ArrayAdapter(Main5Activity.this,android.R.layout.simple_list_item_1,lt);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0866-2410978"));
                    startActivityForResult(i,0);
                }
                if(position==1){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9436055743"));
                    startActivityForResult(i,1);
                }
                if(position==2){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:6913347770"));
                    startActivityForResult(i,2);
                }
                if(position==3){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,3);
                }
                if(position==4){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,4);
                }
                if(position==5){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,5);
                }
                if(position==6){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,6);
                }
                if(position==7){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:8558893911"));
                    startActivityForResult(i,7);
                }
                if(position==8){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,8);
                }
                if(position==9){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,9);
                }
                if(position==10){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,10);
                }
                if(position==11){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0471-2552056"));
                    startActivityForResult(i,11);
                }
                if(position==12){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,12);
                }
                if(position==13){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:020-26127394"));
                    startActivityForResult(i,13);
                }
                if(position==14){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:3852411668"));
                    startActivityForResult(i,14);
                }
                if(position==15){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:108"));
                    startActivityForResult(i,15);
                }
                if(position==16){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:102"));
                    startActivityForResult(i,16);
                }
                if(position==17){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:7005539653"));
                    startActivityForResult(i,17);
                }
                if(position==18){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9439994859"));
                    startActivityForResult(i,18);
                }
                if(position==19){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,19);
                }
                if(position==20){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0141-2225624"));
                    startActivityForResult(i,20);
                }
                if(position==21){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,21);
                }
                if(position==22){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:044-29510500"));
                    startActivityForResult(i,22);
                }
                if(position==23){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,23);
                }
                if(position==24){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0381-2315879"));
                    startActivityForResult(i,24);
                }
                if(position==25){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,25);
                }
                if(position==26){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:18001805145"));
                    startActivityForResult(i,26);
                }
                if(position==27){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:1800313444222"));
                    startActivityForResult(i,27);
                }
                if(position==28){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:03192-232102"));
                    startActivityForResult(i,28);
                }
                if(position==29){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9779558282"));
                    startActivityForResult(i,29);
                }
                if(position==30){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,30);
                }
                if(position==31){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:011-22307145"));
                    startActivityForResult(i,31);
                }
                if(position==32){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:01912520982"));
                    startActivityForResult(i,32);
                }
                if(position==33){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:01982256462"));
                    startActivityForResult(i,33);
                }
                if(position==34){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,34);
                }
                if(position==35){
                    Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:104"));
                    startActivityForResult(i,35);
                }

            }
        });

    }


}

