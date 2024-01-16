package com.ceica.modelo;

public class Proveedor {
    // definir los metodos y las propiedades de esta clase
    private int id;

    private String cif;
    private String nombre;
    private String direccion;
    private String localidad;
    private String provincia;

    public Proveedor(int id) {
        this.id = id;
    }

    public Proveedor() {


    }

    public Proveedor(java.lang.String cif, java.lang.String nombre) {
        this.cif = cif;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getCif() {
        return cif;
    }

    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public java.lang.String getDirección() {
        return direccion;
    }

    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }

    public java.lang.String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(java.lang.String localidad) {
        this.localidad = localidad;
    }

    public java.lang.String getProvincia() {
        return provincia;
    }

    public void setProvincia(java.lang.String provincia) {
        this.provincia = provincia;
    }



    @java.lang.Override
    public java.lang.String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", cif=" + cif +
                ", nombre=" + nombre +
                ", dirección=" + direccion +
                ", localidad=" + localidad +
                ", provincia=" + provincia +
                '}';
    }


}
