package com.codingwithlaxman.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button BAD,BSB,BML,BDV,BPW,BCR;
    TextView TRT;
    EditText ET1,ET2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BAD = (Button)findViewById(R.id.BA);
        BSB = (Button) findViewById(R.id.BS);
        BML =  (Button)findViewById(R.id.BM);
        BDV = (Button) findViewById(R.id.BD);
        BPW =  (Button)findViewById(R.id.BP);
        BCR = (Button) findViewById(R.id.BC);
        TRT= (TextView) findViewById(R.id.TV1);
        ET1= (EditText) findViewById(R.id.TE1);
        ET2= (EditText) findViewById(R.id.TE2);

        BAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ET1.getText().toString());
                double num2 = Double.parseDouble(ET2.getText().toString());
                double result = num1+num2;
                TRT.setText(String.valueOf(result));

            }
        });

        BSB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ET1.getText().toString());
                double num2 = Double.parseDouble(ET2.getText().toString());
                double result = num1-num2;
                TRT.setText(String.valueOf(result));

            }
        });

        BML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ET1.getText().toString());
                double num2 = Double.parseDouble(ET2.getText().toString());
                double result = num1*num2;
                TRT.setText(String.valueOf(result));

            }
        });

        BDV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ET1.getText().toString());
                double num2 = Double.parseDouble(ET2.getText().toString());
                double result = num1/num2;
                TRT.setText(String.valueOf(result));

            }
        });


        BPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ET1.getText().toString());
                double num2 = Double.parseDouble(ET2.getText().toString());
                double result =Math.pow(num1,num2);
                TRT.setText(String.valueOf(result));

            }
        });

        BCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ET1.setText("");
                ET2.setText("");

            }
        });


    }
}
