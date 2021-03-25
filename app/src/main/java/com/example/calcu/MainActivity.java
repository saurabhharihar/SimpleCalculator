package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Add;
    private Button Sub;
    private Button Mul;
    private Button Div;
    private EditText n1;
    private EditText n2;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.editTextNumber);
        n2=findViewById(R.id.editTextNumber2);
        textView=findViewById(R.id.textView4);
        Add = findViewById(R.id.button2);
     Sub=findViewById(R.id.button3);
     Mul=findViewById(R.id.button4);
     Div=findViewById(R.id.button5);
     Add.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             double c = Double.parseDouble(n1.getText().toString())+Double.parseDouble(n2.getText().toString());
             textView.setText(" Addition is : "+c);
         }
     });
     Sub.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             double c = Double.parseDouble(n1.getText().toString())-Double.parseDouble(n2.getText().toString());
             textView.setText(" Subtraction is : "+c);
         }
     });
    Mul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double c = Double.parseDouble(n1.getText().toString())*Double.parseDouble(n2.getText().toString());
            textView.setText(" Multiplication is : "+c);
        }
    });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = Double.parseDouble(n1.getText().toString())/Double.parseDouble(n2.getText().toString());
                textView.setText(" Division is : "+c);
            }
        });
    }
}