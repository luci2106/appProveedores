package com.ceica.modelo;

public class Proveedor {
    // definir los metodos y las propiedades de esta clase
    private int id;

    private String cif;
    private String nombre;
    private String dirección;
    private String localidad;
    private String provincia;

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
        return dirección;
    }

    public void setDirección(java.lang.String dirección) {
        this.dirección = dirección;
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

    public Proveedor() {

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", cif=" + cif +
                ", nombre=" + nombre +
                ", dirección=" + dirección +
                ", localidad=" + localidad +
                ", provincia=" + provincia +
                '}';
    }
}
