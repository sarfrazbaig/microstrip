package com.example.microstripcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Systhesis extends AppCompatActivity {

    EditText impedence;
    EditText dielectric;
    String imp,dil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systhesis);
        Intent main_intent = getIntent();

    }

    public void synthesis_calc(View view){
        impedence = (EditText) findViewById(R.id.editText4);
        dielectric = (EditText) findViewById(R.id.editText8);

        imp = impedence.getText().toString();
        dil = dielectric.getText().toString();

        Intent synthesis_result_calc = new Intent(this,SysthesisResults.class);

        synthesis_result_calc.putExtra("impedence",imp);
        synthesis_result_calc.putExtra("dielectric",dil);

        startActivity(synthesis_result_calc);
    }



}
