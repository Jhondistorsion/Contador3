package com.example.contador3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contador;
    private TextView numero = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
        numero = (TextView) findViewById(R.id.txcontador);
    }

    public void contador(View view) {
        contador++;
        numero.setText(String.valueOf(contador));
    }

    public void reset(View view) {
        contador = 0;
        numero.setText(String.valueOf(contador));
    }
}