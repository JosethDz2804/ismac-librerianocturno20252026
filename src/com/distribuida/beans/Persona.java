package com.distribuida.beans;

/**
 * Clase base que representa a una persona.
 * Se usa para aplicar HERENCIA con las clases Autor y Cliente.
 */
public class Persona {

    // Atributos comunes
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected String telefono;
    protected String correo;

    // Constructores
    public Persona() {}

    public Persona(String nombre, String apellido, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    // Método polimórfico
    public String obtenerInformacion() {
        return nombre + " " + apellido + " - " + correo;
    }
}
