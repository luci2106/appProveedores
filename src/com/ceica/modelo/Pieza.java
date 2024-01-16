package com.ceica.modelo;

public class Pieza {
    private int id;
    private  String nombre;
    private  String color;
    private Double precio;
    // categoria en mayuculas la clase que
    private  Categoria  categoria;

    public Pieza(String nombre, String color, Double precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }
}


