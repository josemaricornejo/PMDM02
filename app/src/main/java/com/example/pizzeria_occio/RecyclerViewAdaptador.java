package com.example.pizzeria_occio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder>{



    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre, precio, cantidad;
        private ImageView foto;

        private Button btnCantidad;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.tvPizza);
            precio=(TextView)itemView.findViewById(R.id.tvPrecio2);
            cantidad=(TextView)itemView.findViewById(R.id.tvCantidad2);
            foto=(ImageView)itemView.findViewById(R.id.ivPizza);

            btnCantidad=(Button)itemView.findViewById(R.id.btnCantidad);

        }
    }

    public ArrayList<PizzaElemento> listaPizza;

    public RecyclerViewAdaptador(ArrayList<PizzaElemento> listaPizza) {
        this.listaPizza = listaPizza;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pizza,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {


        holder.nombre.setText(listaPizza.get(position).getNombre());
        holder.precio.setText(""+(int)listaPizza.get(position).getPrecio()+" €");
        holder.cantidad.setText(""+listaPizza.get(position).getCantidad());
        holder.foto.setImageResource(listaPizza.get(position).getFoto());



        final ViewHolder finalHolder = holder;

        holder.btnCantidad.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                int cantidadPizza= listaPizza.get(position).getCantidad();
                cantidadPizza++;
                listaPizza.get(position).setCantidad(cantidadPizza);
                finalHolder.cantidad.setText(""+listaPizza.get(position).getCantidad());

            }
        });


    }


    @Override
    public int getItemCount() {
        return listaPizza.size();
    }
}
