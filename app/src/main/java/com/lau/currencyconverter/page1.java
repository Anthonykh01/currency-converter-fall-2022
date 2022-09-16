package com.lau.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class page1 extends AppCompatActivity {
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
    }

    public void login(View v) {
        String username1=username.getText().toString();
        String password1=password.getText().toString();
        if (username1=="user.leb"&&password1=="123456"){
            Intent intent = new Intent(this, page1.class);
            startActivity(intent);

        }
    }


}