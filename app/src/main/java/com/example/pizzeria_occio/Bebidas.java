package com.example.pizzeria_occio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bebidas extends AppCompatActivity {

    private Button btnCerveza, btnCola, btnAgua;
    private int cantidadCerveza, cantidadCola, cantidadAgua;
    private TextView tvCantidadCerveza, tvCantidadCola, tvCantidadAgua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bebidas);

        btnCerveza=(Button) findViewById(R.id.btnCerveza);
        btnCola=(Button) findViewById(R.id.btnCola);
        btnAgua=(Button) findViewById(R.id.btnAgua);

        tvCantidadCerveza=(TextView) findViewById(R.id.tvCantidadCerveza);
        tvCantidadCola=(TextView) findViewById(R.id.tvCantidadCola);
        tvCantidadAgua=(TextView) findViewById(R.id.tvCantidadAgua);

        btnCerveza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cantidadCerveza++;
                tvCantidadCerveza.setText(""+cantidadCerveza);
            }
        });

        btnCola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cantidadCola++;
                tvCantidadCola.setText(""+cantidadCola);
            }
        });

        btnAgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cantidadAgua++;
                tvCantidadAgua.setText(""+cantidadAgua);
            }
        });


    }
}