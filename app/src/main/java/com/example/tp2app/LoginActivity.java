package com.example.tp2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText userlogin;
    EditText userpass;
    String username="TPandINFO";
    String password="secret";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.userlogin=findViewById(R.id.editTextTextPersonName);
        this.userpass=findViewById(R.id.editTextTextPassword);
    }
    public void onLogin(View view){
        boolean v;
        if(username.compareTo(userlogin.getText().toString())==0 && password.compareTo(userpass.getText().toString())==0) {
            v = true;
        }
        else{
            v=false;
        }
        if(v==true){
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", MainActivity.num, null));
            startActivity(intent);
        }
        finish();
        }

        public void onCancel(View view){
        finish();

        }



    }
