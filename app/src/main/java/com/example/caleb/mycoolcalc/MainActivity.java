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
        TextView result=(TextView) findViewById(R.id.result);
        result.setText("0");
    }

    public void buttonSeven(View view) {
        TextView result=(TextView) findViewById(R.id.result);
        result.setText("7");
    }

    public void buttonEight(View view) {
        TextView result=(TextView) findViewById(R.id.result);
        result.setText("8");
    }

    public void buttonNine(View view) {
        TextView result=(TextView) findViewById(R.id.result);
        result.setText("9");
    }
}
