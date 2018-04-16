package com.example.microstripcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Losses extends AppCompatActivity {

    Double z,w;
    String omega,sigma;
    EditText omega_edit,sigma_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losses);

        Intent loss_parameters = getIntent();
        z = loss_parameters.getExtras().getDouble("z");
        w = loss_parameters.getExtras().getDouble("width");
    }

    public void loss_calc(View view){

        omega_edit = (EditText)findViewById(R.id.omega);
        sigma_edit = (EditText)findViewById(R.id.sigma);

        omega = omega_edit.getText().toString();
        sigma = sigma_edit.getText().toString();

        Intent losses_cal = new Intent(this,LossIntermediateCalc.class);
        losses_cal.putExtra("om",omega);
        losses_cal.putExtra("si",sigma);
        losses_cal.putExtra("zc",z);
        losses_cal.putExtra("wi",w);

        startActivity(losses_cal);
    }


}
