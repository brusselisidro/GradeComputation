package com.brussel.gradecomputation;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tQz1, tQz2, tSW, tLE, tME;
    Button send;
    double Qz1, Qz2, SW1, LE1, ME1, RA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = (Button) findViewById(R.id.btnSend);
        tQz1 = (EditText) findViewById(R.id.Q1);
        tQz2 = (EditText) findViewById(R.id.Q2);
        tSW = (EditText) findViewById(R.id.SW);
        tLE = (EditText) findViewById(R.id.LE);
        tME = (EditText) findViewById(R.id.ME);
    }
    public void callSecondActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        Qz1 = Float.parseFloat(tQz1.getText().toString());
        Qz2 = Float.parseFloat(tQz2.getText().toString());
        SW1 = Float.parseFloat(tSW.getText().toString());
        LE1 = Float.parseFloat(tLE.getText().toString());
        ME1 = Float.parseFloat(tME.getText().toString());

        RA = ((Qz1 * 0.1) + (Qz2 * 0.1) + (SW1 * 0.1) + (LE1 * 0.4) + (ME1 * 0.3));

        intent.putExtra("raw_ave", Double.toString(RA));
        if(RA <= 100 && RA > 94) {
            intent.putExtra("fg", "1.0");
        }
        else if(RA <= 94 && RA > 92) {
            intent.putExtra("fg", "1.25");
        }
        else if(RA <= 92 && RA > 90) {
            intent.putExtra("fg", "1.5");
        }
        else if(RA <= 90 && RA > 85) {
            intent.putExtra("fg", "1.75");
        }
        else if(RA <= 85 && RA > 80) {
            intent.putExtra("fg", "2.0");
        }
        else if(RA <= 80 && RA > 75 ) {
            intent.putExtra("fg", "2.25");
        }
        else if(RA <= 75 && RA > 70) {
            intent.putExtra("fg", "2.5");
        }
        else if(RA <= 70 && RA > 65) {
            intent.putExtra("fg", "2.75");
        }
        else if(RA <= 65 && RA >= 60) {
            intent.putExtra("fg", "3.0");
        }
        else if(RA < 60){
            intent.putExtra("fg", "Failed 5.0");
        }
        startActivity(intent);

    }


}