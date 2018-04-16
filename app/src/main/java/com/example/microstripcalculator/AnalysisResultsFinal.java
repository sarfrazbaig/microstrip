package com.example.microstripcalculator;

        import android.content.Intent;
        import android.renderscript.Double2;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class AnalysisResultsFinal extends AppCompatActivity {

    Double ere_final,zc_final,wid;

    EditText ere_ed,zc_ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis_results_final);

        Intent calculated_result = getIntent();

        ere_final = calculated_result.getExtras().getDouble("ere");
        zc_final = calculated_result.getExtras().getDouble("zc");
        wid = calculated_result.getExtras().getDouble("width");
        ere_ed = (EditText)findViewById(R.id.editText5);
        zc_ed = (EditText)findViewById(R.id.editText6);

        ere_ed.setText(Double.toString(ere_final));
        zc_ed.setText(Double.toString(zc_final));

    }

    public void back_home_main(View view){
        Intent main_activity = new Intent(this,MainActivity.class);

        startActivity(main_activity);
    }

    public void loss_calce(View view){
        Intent loss_calc = new Intent(this,Losses.class);
        loss_calc.putExtra("z",zc_final);
        loss_calc.putExtra("width",wid);

        startActivity(loss_calc);
    }
}
