package com.distribuida.beans;

/**
 * Representa un libro, con relaciones a Autor y Categoria.
 */
public class Libro {

    private int idLibro;
    private String titulo;
    private String editorial;
    private int numPaginas;
    private String edicion;
    private String idioma;
    private String fechaPublicacion;
    private String descripcion;
    private String tipoPasta;
    private String ISBN;
    private int numEjemplares;
    private String portada;
    private String presentacion;
    private double precio;

    // Relaciones
    private Categoria categoria;
    private Autor autor;

    public Libro() {}

    public Libro(int idLibro, String titulo, String editorial, int numPaginas, String edicion,
                 String idioma, String fechaPublicacion, String descripcion, String tipoPasta,
                 String ISBN, int numEjemplares, String portada, String presentacion,
                 double precio, Categoria categoria, Autor autor) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.edicion = edicion;
        this.idioma = idioma;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.tipoPasta = tipoPasta;
        this.ISBN = ISBN;
        this.numEjemplares = numEjemplares;
        this.portada = portada;
        this.presentacion = presentacion;
        this.precio = precio;
        this.categoria = categoria;
        this.autor = autor;
    }

    // Getters
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro=" + idLibro +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", autor=" + autor +
                '}';
    }
}
