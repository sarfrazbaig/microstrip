package com.example.microstripcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnalysisResults extends AppCompatActivity {

    Double w,h,er,u,a,b,ere,v,x,zc_result,f,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis_results);

        Intent values = getIntent();

        w = Double.valueOf(values.getExtras().getString("width"));
        h = Double.valueOf(values.getExtras().getString("height"));
        er = Double.valueOf(values.getExtras().getString("dil_constant"));

        u = w / h;

        v = Math.log((Math.pow(u,4) + Math.pow(u/52,2)) / (Math.pow(u,4)+0.432));

        x =  1 + Math.pow(u/18.1,3);

        a = 1 + (1/49)*v + (1/18.7)*Math.log(x);

        b = 0.564*(Math.pow(  (er-0.9)/(er+3) , 0.053   ) );

        ere = (er+1)/2  + ((er-1)/2)*Math.pow(1+(10/u),-a*b);

        f = 6 + (2*Math.PI - 6)*Math.exp(-Math.pow(  (30.666/u),0.7528  ));

        d = (f/u) + Math.pow(1+((2/u)*(2/u)),0.5);

        zc_result = (60/ere)*Math.log(d);

    }

    public void show_result_analysis(View view){
        Intent final_result_analysis = new Intent(this,AnalysisResultsFinal.class);

        final_result_analysis.putExtra("ere",ere);
        final_result_analysis.putExtra("zc",zc_result);
        final_result_analysis.putExtra("width",w);

        startActivity(final_result_analysis);
    }
}
