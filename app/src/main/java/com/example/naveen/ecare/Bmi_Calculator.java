package com.example.naveen.ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class Bmi_Calculator extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.naveen.ecare.MESSAGE";
    Integer feet,inch,weight;
    double bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__calculator);
    }
    public void calculateBMI(){
        EditText Height_f = (EditText)findViewById(R.id.editText);
        feet = Integer.parseInt(Height_f.getText().toString());
        EditText Height_inch  = (EditText)findViewById(R.id.editText2);
        inch = Integer.parseInt(Height_inch.getText().toString());
        EditText weight_kg = (EditText)findViewById(R.id.editText3);
        weight = Integer.parseInt(weight_kg.getText().toString());
        Integer totalinches = feet*12 + inch;
        double meter = totalinches*(0.025);
        double sq_m = meter*meter;
        bmi = (weight)/(sq_m);
    }
    public void GiveBMI(View v){
      calculateBMI();
      Intent intent = new Intent(this,GetBmi.class);
      String message = String.valueOf(bmi);
      intent.putExtra(EXTRA_MESSAGE,message);
      startActivity(intent);
    }
}
