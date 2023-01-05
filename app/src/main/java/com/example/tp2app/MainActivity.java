package com.example.tp2app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    EditText phoneNumber;
    EditText webUrl;
    public static String num="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.phoneNumber=(EditText) findViewById(R.id.editTextTextPersonName2);
        this.webUrl=(EditText) findViewById(R.id.editTextWebsite);
    }
    public void onCall(View view){
        this.num=phoneNumber.getText().toString();
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);

    }
    public void onWorldClick(View view){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
        intent.setData(Uri.parse(this.webUrl.getText().toString()));
        startActivity(intent);
    }
    public void onPCClick(View view){

    }
}