package com.example.caleb.mycoolcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClear(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("0");
    }

    public void buttonOne(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(result + "1");
    }

    public void buttonTwo(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(result + "2");
    }

    public void buttonThree(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(result + "3");
    }

    public void buttonFour(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(result + "4");
    }

    public void buttonFive(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(result + "5");
    }

    public void buttonSix(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(result + "6");
    }

    public void buttonSeven(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(result + "7");
    }

    public void buttonEight(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(result + "8");
    }


    public void buttonNine(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(result + "9");
    }
}
