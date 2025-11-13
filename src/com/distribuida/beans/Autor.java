package com.distribuida.beans;

/**
 * Representa a un autor, hereda de Persona.
 */
public class Autor extends Persona {

    private int idAutor;
    private String pais;

    public Autor() {}

    public Autor(int idAutor, String pais, String nombre, String apellido,
                 String direccion, String telefono, String correo) {
        super(nombre, apellido, direccion, telefono, correo);
        this.idAutor = idAutor;
        this.pais = pais;
    }

    public int getIdAutor() { return idAutor; }
    public void setIdAutor(int idAutor) { this.idAutor = idAutor; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    @Override
    public String obtenerInformacion() {
        return "Autor: " + nombre + " " + apellido + " (" + pais + ")";
    }

    @Override
    public String toString() {
        return "Autor{" +
                "idAutor=" + idAutor +
                ", pais='" + pais + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
