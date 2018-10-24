package com.example.harshitasingh05.currencyconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onclickDollar(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.editText);
        TextView t1 = (TextView)findViewById(R.id.textView2);

        Double num1 = Double.parseDouble(e1.getText().toString());
        Double obj = num1 * 0.014;

        t1.setText((String.format("%.2f", obj)) + " $");

        Log.i("amount",e1.getText().toString());
    }

    public void onclickPound(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.editText);
        TextView t1 = (TextView)findViewById(R.id.textView2);

        Double num2 = Double.parseDouble(e1.getText().toString());
        Double obj = num2 * 0.011;

        t1.setText((String.format("%.2f", obj)) + " £" );
    }
    public void onclickEuro(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.editText);
        TextView t1 = (TextView)findViewById(R.id.textView2);

        Double num3 = Double.parseDouble(e1.getText().toString());
        Double obj = num3 * 0.012;

        t1.setText((String.format("%.2f", obj)) + " €");
    }

    }



