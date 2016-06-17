package com.example.sayami.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button sumbtn,diffbtn,mulbtn,divbtn;
    private EditText etfirst,etsecond;
    private TextView res1;
    private static final String TAG = "ramensMessages";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Basic Calc:: Activity Created!!");
        init();
    }

    private void init() {
        sumbtn = (Button) findViewById(R.id.plusBtn);
        diffbtn = (Button) findViewById(R.id.minusBtn);
        mulbtn = (Button) findViewById(R.id.mulBtn);
        divbtn = (Button) findViewById(R.id.divBtn);

        etfirst = (EditText) findViewById(R.id.editText1);
        etsecond = (EditText) findViewById(R.id.editText2);

        res1 = (TextView) findViewById(R.id.textView2);

        sumbtn.setOnClickListener(this);
        diffbtn.setOnClickListener(this);
        mulbtn.setOnClickListener(this);
        divbtn.setOnClickListener(this);


    }

    public void onClick(View view){


            String num1 = etfirst.getText().toString();
            String num2 = etsecond.getText().toString();
        try{
            Integer.parseInt(num1);
        }
        catch (Exception e){
            num1="0";
        }
        try{

            Integer.parseInt(num2);
        }
        catch (Exception e2){
            num2="0";
        }


        Log.i(TAG, "onClick");
        Log.i(TAG, "number1" + num1);
        Log.i(TAG, "number2" + num2);


        switch(view.getId()){
            case R.id.plusBtn:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                res1.setText(String.valueOf(addition));
                Log.i(TAG, String.valueOf(addition));
                break;
            case R.id.minusBtn:
                int subs= Integer.parseInt(num1) - Integer.parseInt(num2);
                res1.setText(String.valueOf(subs));
                Log.i(TAG, String.valueOf(subs));
                break;
            case R.id.mulBtn:
                int prodct= Integer.parseInt(num1) * Integer.parseInt(num2);
                res1.setText(String.valueOf(prodct));
                Log.i(TAG, String.valueOf(prodct));
                break;
            case R.id.divBtn:
                try {
                    int div= Integer.parseInt(num1) / Integer.parseInt(num2);
                    res1.setText(String.valueOf(div));
                    Log.i(TAG, String.valueOf(div));
                }
                catch (Exception e){
                    res1.setText("Cannot Divide!");
                    Log.i(TAG, "Cannot Divide!");
                }
                break;


        }
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

}
//TODO 1 aksjdkajdhkajd
//TODO 2 KJSHDFKJH