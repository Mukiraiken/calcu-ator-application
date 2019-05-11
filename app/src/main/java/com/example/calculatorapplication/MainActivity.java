package com.example.calculatorapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.calculatorapplication.R;

public class MainActivity extends AppCompatActivity {
    //Declaration of components (editText & textview) and global variables (string and double)
    EditText et1, et2;
    String value1, value2;
    Double val1, val2,total;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference the components to the layout file
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tvResult = findViewById(R.id.tvResult);
    }


    public void addition(View view) {
        //do the addition and display the results in the textview
        value1 = et1.getText().toString();
        value2 = et2.getText().toString();
        //converting to double
        val1 = Double.parseDouble(value1);
        val2 = Double.parseDouble(value2);
        //add and display the result
        total = val1 + val2;

        // tvResult.setText(total.toString());
        String finalresult = String.valueOf(total);
        tvResult.setText(finalresult);
    }

    public void substraction(View view) {
        value1 = et1.getText().toString();
        value2 = et2.getText().toString();

        //converting to double
        val1 = Double.parseDouble(value1);
        val2 = Double.parseDouble(value2);

        //do the subtraction and display the results in the textview
        total = val1 - val2;
        //tvResult.setText(total.toString());
        String finalresult = String.valueOf(total);
        tvResult.setText(finalresult);
    }

    public void multiplication(View view) {

        value1 = et1.getText().toString();
        value2 = et2.getText().toString();

        //converting to double
        val1 = Double.parseDouble(value1);
        val2 = Double.parseDouble(value2);

        //do the multiplication and display the results in the textview
        total = val1 * val2;
        // tvResult.setText(total.toString());
        String finalresult = String.valueOf(total);
        tvResult.setText(finalresult);
    }
    public void division(View view) {

        value1 = et1.getText().toString();
        value2 = et2.getText().toString();

        //converting to double
        val1 = Double.parseDouble(value1);
        val2 = Double.parseDouble(value2);


        //do the division and display the results in the textview
        total = val1 / val2;
        // tvResult.setText(total.toString());
        String finalresult = String.valueOf(total);
        tvResult.setText(finalresult);
    }


}