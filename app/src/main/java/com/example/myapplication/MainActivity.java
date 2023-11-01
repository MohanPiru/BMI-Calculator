package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import java.text.DecimalFormat;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textview1= findViewById(R.id.editTextTextPersonName);
        textview2=findViewById(R.id.editTextTextPersonName2);
        textview3=findViewById(R.id.textView3);
        textview4=findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
         public void onClick(View view){
//                Toast.makeText(MainActivity.this,"hi my name is piru",Toast.LENGTH_SHORT).show();
//
                DecimalFormat df= new DecimalFormat("#.##");
                String s1=textview1.getText().toString();
                int ht=Integer.parseInt(s1);
                String s2=textview2.getText().toString();
                int wt=Integer.parseInt(s2);

                float bmi = (float) (wt*10000)/(ht*ht);
                textview3.setText("Your BMI is "+ df.format(bmi) +" kg/m2");

                if(bmi<=18.4){
                    textview4.setText("You are Underweight");
                }
                else if(bmi>18.4 && bmi<=24.9 ){
                    textview4.setText("Your BMI is Normal");
                }
                else if(bmi>24.9 && bmi<=39.9){
                    textview4.setText("You are Overweighted");
                }
                else{
                    textview4.setText("You are Obese");
                }
                }
        });

    }
}