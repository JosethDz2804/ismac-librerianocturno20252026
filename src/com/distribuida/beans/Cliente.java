package com.distribuida.beans;
/**
 * Representa a un cliente, hereda de Persona.
 */
public class Cliente extends Persona {

    private int idCliente;
    private String cedula;

    public Cliente() {}

    public Cliente(int idCliente, String cedula, String nombre, String apellido,
                   String direccion, String telefono, String correo) {
        super(nombre, apellido, direccion, telefono, correo);
        this.idCliente = idCliente;
        this.cedula = cedula;
    }

    // Getters y Setters
    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    @Override
    public String obtenerInformacion() {
        return "Cliente: " + nombre + " " + apellido + " (" + cedula + ")";
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
