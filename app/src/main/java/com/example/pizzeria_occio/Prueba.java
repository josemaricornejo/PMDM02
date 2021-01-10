package com.example.pizzeria_occio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pizzeria_occio.R;

import java.util.ArrayList;

public class Prueba extends AppCompatActivity {

    private RecyclerView recyclerViewPizza;
    private RecyclerViewAdaptador adaptadorPizza;
    PizzaElemento pizzaElemento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prueba);

        recyclerViewPizza=(RecyclerView)findViewById(R.id.recyclerPizza);
        recyclerViewPizza.setLayoutManager(new GridLayoutManager(this,2));

        adaptadorPizza= new RecyclerViewAdaptador(obtenerPizza());
        recyclerViewPizza.setAdapter(adaptadorPizza);

    }

    public ArrayList<PizzaElemento> obtenerPizza(){
        ArrayList<PizzaElemento> pizza = new ArrayList<>();
        pizza.add(new PizzaElemento("Barbacoa", 12, R.drawable.barbacoa,0));
        pizza.add(new PizzaElemento("Carbonara", 13, R.drawable.carbonara, 0));
        pizza.add(new PizzaElemento("Extravaganzza", 14, R.drawable.extravaganzza, 0));
        pizza.add(new PizzaElemento("Pecado", 15, R.drawable.pecado, 0));

        return pizza;

    }
}