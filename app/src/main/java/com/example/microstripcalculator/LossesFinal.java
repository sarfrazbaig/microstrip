package com.example.microstripcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LossesFinal extends AppCompatActivity {


    Double a;
    EditText value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losses_final);

        Intent calculated_result = getIntent();
        a = calculated_result.getExtras().getDouble("alpha");

        value = (EditText)findViewById(R.id.editText5);
        value.setText(Double.toString(a));
    }

    public void back_home_main(View view){
        Intent main_activity = new Intent(this,MainActivity.class);

        startActivity(main_activity);
    }
}
