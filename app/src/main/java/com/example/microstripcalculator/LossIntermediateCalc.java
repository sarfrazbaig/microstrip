package com.example.microstripcalculator;

import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class LossIntermediateCalc extends AppCompatActivity {
    Double o,s,z,w,rs,alphac,u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loss_intermediate_calc);



        Intent values = getIntent();
        o = Double.valueOf(values.getExtras().getString("om"));
        s=  Double.valueOf(values.getExtras().getString("si"));
        z = Double.valueOf(values.getExtras().getString("zc"));
        w = Double.valueOf(values.getExtras().getString("wi"));

        u =  0.00000125663706;
        rs = Math.sqrt(o*u/(2*s));
        alphac = (8.686*rs)/(z*w);
    }


    public void losses_final(View view){
        Intent loss_final = new Intent(this,LossesFinal.class);
        loss_final.putExtra("alpha",alphac);

        startActivity(loss_final);
    }


}

