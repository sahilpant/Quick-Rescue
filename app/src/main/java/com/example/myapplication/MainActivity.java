package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.ConnectionRequest;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import java.text.DateFormat;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    String TAG = "ActivityOne";

    public static final int ERROR_DIALOG_REQUEST = 9001;;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =  findViewById(R.id.button);
        btn.setOnClickListener(this);
        Log.i(TAG,"--onCreate--");
    }
    @Override

    protected void onStart(){

        super.onStart();

        Log.i(TAG,"--onStart--");

    }

    @Override

    protected void onRestart(){

        super.onRestart();

        Log.i(TAG,"--onRestart--");

    }

    @Override
    protected void onResume(){

        super.onResume();

        Log.i(TAG,"--onResume--");

    }

    @Override

    protected void onPause(){

        super.onPause();

        Log.i(TAG,"--onPause--");

    }

    @Override

    protected void onStop(){

        super.onStop();

        Log.i(TAG,"--onStop--");

    }

    @Override

    protected void onDestroy(){

        super.onDestroy();
        Log.i(TAG,"--onDestroy--");

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button)
        {
            Intent intent = new Intent (MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }

    }
    public boolean isServicesOK()
    {
        Log.d(TAG,"isServicesOK:checking google services version");
        int  available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(MainActivity.this);
        if (available == ConnectionResult.SUCCESS){
            Log.d(TAG,"isServicesOK:Google Play Services is working");
            return true;
        }
        else if(GoogleApiAvailability.getInstance().isUserResolvableError(available)) {
            Log.d(TAG, "isServicesOK:an error ocured but we can fix it");
            Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(MainActivity.this, available, ERROR_DIALOG_REQUEST);
            dialog.show();
        }else {
            Toast.makeText(this, "You can't make map requests", Toast.LENGTH_SHORT).show();
        }
        return false;
        }
    }
