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
    public static int challenge1;
    EditText chall1;
    EditText chall2;
    public static int challenge2;
    public static String num="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.phoneNumber=(EditText) findViewById(R.id.editTextTextPersonName2);
        this.webUrl=(EditText) findViewById(R.id.editTextWebsite);
        this.chall1=findViewById(R.id.challenge1);
        this.chall2=findViewById(R.id.challenge2);
    }
    public void onCall(View view){
        this.num=phoneNumber.getText().toString();
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);

    }
    public void onWorldClick(View view){
        this.challenge1=Integer.parseInt(this.chall1.getText().toString());
        this.challenge2=Integer.parseInt(this.chall2.getText().toString());
        /*Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
        intent.setData(Uri.parse(this.webUrl.getText().toString()));
        startActivity(intent);*/
        Intent intent = new Intent(MainActivity.this,CheckActivity.class);
        startActivity(intent);
    }
    public void onPCClick(View view){
        Intent intent = new Intent(MainActivity.this,CheckActivity.class);
        startActivity(intent);
    }
}