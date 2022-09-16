package com.lau.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        if (username1.equals("user.leb")&&password1.equals("123456")){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else{
            Toast toast=Toast.makeText(getApplicationContext(),"wrong username or password ", Toast.LENGTH_LONG);
            toast.show();
        }
    }


}