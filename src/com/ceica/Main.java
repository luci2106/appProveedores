package com.ceica;


import com.ceica.controlador.AlmacenController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AlmacenController almacen=new AlmacenController();
        almacen.nuevoProveedor("a","nombre", "dir", "localidad", "provincia");
        almacen.nuevoProveedor("b", "nom", "fgy", "gjhg", "hgjhg");

        System.out.println(almacen.toString());
        almacen.borrarProveedor("a");
        System.out.println(almacen.toString());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



        }
    }
