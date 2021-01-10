package com.example.pizzeria_occio;

public class PizzaElemento {

    private String nombre;
    private double precio;
    private int foto;
    private int cantidad;

    public PizzaElemento(){

    }

    public PizzaElemento(String nombre, double precio, int foto, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
