package com.brussel.gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class SecondActivity extends AppCompatActivity {

    TextView raw, fin;
    Button Return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        raw = (TextView) findViewById(R.id.RA);
        fin = (TextView) findViewById(R.id.FG);
        Return = (Button) findViewById(R.id.btnReturn);
        String r = getIntent().getStringExtra("raw_ave");
        String f = getIntent().getStringExtra("fg");
        raw.setText(r);
        fin.setText(f);
    }
    public void Back(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}