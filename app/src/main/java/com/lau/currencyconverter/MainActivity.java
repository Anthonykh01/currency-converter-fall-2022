package com.lau.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
//        String lbp_input=lbp_rate.getText().toString();
//        String usd_input=usd_rate.getText().toString();
//
//        if (lbp_input!=null&&usd_input.isEmpty()) {
//            int result = Integer.parseInt(lbp_input) /40000;
//            Toast toast = Toast.makeText(getApplicationContext(), "the equivalent to this amount in usd is :" + result, Toast.LENGTH_LONG);
//            toast.show();
//        }
//
//        else if(usd_input!=null&&lbp_input.isEmpty()){
//            int result=Integer.parseInt(usd_input)*40000;
//            Toast toast=Toast.makeText(getApplicationContext(),"the equivalent to this amount in lbp is :"+result, Toast.LENGTH_LONG);
//            toast.show();
//        }
//        else if(lbp_input!=null&&usd_input!=null)
//        {
//
//            Toast toast=Toast.makeText(getApplicationContext(),"Invalid input please fill only one of the boxes ", Toast.LENGTH_LONG);
//            toast.show();
//
//        }
        Intent intent = new Intent(this, page1.class);
        startActivity(intent);
    }

}