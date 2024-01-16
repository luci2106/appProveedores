package com.ceica.controlador;

import com.ceica.modelo.Pedido;
import com.ceica.modelo.Pieza;
import com.ceica.modelo.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class AlmacenController {
    // el controlador es el que trabaja con todos los modelos
    private List<Proveedor> proveedorList;
    private List<Pieza> piezaList;
    private List<Pedido> pedidoList;

    public AlmacenController() {
        proveedorList = new ArrayList<>();
        pedidoList = new ArrayList<>();
        piezaList = new ArrayList<>();
    }


    public List<Proveedor> getProveedorList() {
        return proveedorList;
    }

    public void setProveedorList(List<Proveedor> proveedorList) {
        this.proveedorList = proveedorList;
    }

    public List<Pieza> getPiezaList() {
        return piezaList;
    }

    public void setPiezaList(List<Pieza> piezaList) {
        this.piezaList = piezaList;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    public boolean nuevoProveedor(String cif, String nombre, String direccion, String provincia, String localidad) {
        Proveedor proveedor = new Proveedor(cif, nombre);
        proveedor.setDireccion(direccion);
        proveedor.setLocalidad(localidad);

        proveedor.setProvincia(provincia);
        // para borrar proveedor
        // una


// Busca el índice del elemento que deseas eliminar

        return proveedorList.add(proveedor);


    }

    public boolean borrarProveedor(String cif) {
        for (int i = 0; i < proveedorList.size(); i++) {
            if (cif.equals(proveedorList.get(i).getCif())) {
                proveedorList.remove(i);
                return true;
            }
        }

    }

    @Override
    public String toString() {
        return "AlmacenController{" +
                "proveedorList=" + proveedorList + "\n" +
                ", piezaList=" + piezaList + "\n" +
                ", pedidoList=" + pedidoList +
                '}';


    }
}