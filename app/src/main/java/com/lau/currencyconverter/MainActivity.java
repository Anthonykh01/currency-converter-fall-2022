package com.lau.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText lbp_rate;
    EditText usd_rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbp_rate=(EditText) findViewById(R.id.lbp_rate);
        usd_rate=(EditText) findViewById(R.id.usd_rate);
    }
    public void Pressed_button(View v) {

    }

}