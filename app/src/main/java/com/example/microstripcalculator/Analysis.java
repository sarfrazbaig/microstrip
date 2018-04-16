package com.example.microstripcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Analysis extends AppCompatActivity {

    String w,h,er;
    EditText w_ed,h_ed,er_ed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);

    }

    public void analysis_calc(View view){
        w_ed = (EditText)findViewById(R.id.editText2);
        h_ed = (EditText)findViewById(R.id.editText);
        er_ed = (EditText)findViewById(R.id.editText3);

        w = w_ed.getText().toString();
        h = h_ed.getText().toString();
        er = er_ed.getText().toString();

        Intent analysis_result_calc = new Intent(this,AnalysisResults.class);

        analysis_result_calc.putExtra("width",w);
        analysis_result_calc.putExtra("height",h);
        analysis_result_calc.putExtra("dil_constant",er);

        startActivity(analysis_result_calc);

    }

}
