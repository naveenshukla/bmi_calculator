package com.example.naveen.ecare;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GetBmi extends AppCompatActivity {
    String data;
    long value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_get_bmi);
        data = getIntent().getStringExtra("com.example.naveen.ecare.MESSAGE");
        TextView textView = (TextView)findViewById(R.id.textView4);
        value = (long) Double.parseDouble(data);
        value = Math.round(value);
        textView.setText("Your BMI Index is " + value);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        /*TextView textView1 = (TextView)findViewById(R.id.textView5);*/
        if(value<18.5){
            imageView.setImageResource(R.drawable.underweight);
            textView.append(" You are underweight");
        }
        else if(value>=18.5 && value<25){
            imageView.setImageResource(R.drawable.healthyweight);
            textView.append(" Great!!! You are healthy person");
        }
        else if(value>=25 && value<30){
            imageView.setImageResource(R.drawable.overweight);
            textView.append(" You are overweight");
        }
        else if(value>=30){
            imageView.setImageResource(R.drawable.obese);
            textView.append(" You are obese!");
        }
    }


}
