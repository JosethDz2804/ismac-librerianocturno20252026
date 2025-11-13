package com.distribuida.principal;

import com.distribuida.beans.*;

/**
 * Clase de prueba para la entidad Libro, relacionando Autor y Categoria.
 */
public class LibroPrincipal {

    public static void main(String[] args) {

        // Crear los objetos relacionados
        // fkdlsakflñsafkdñsk
        Categoria categoria = new Categoria(1, "Ciencia Ficción", "Historias futuristas o tecnológicas");
        Autor autor = new Autor(1, "EE.UU.", "Isaac", "Asimov", "New York", "0987654321", "asimov@example.com");

        // Crear el libro  222
        Libro libro = new Libro(
                1,
                "Fundación",
                "Gnome Press",
                255,
                "1ra edición",
                "Inglés",
                "1951-01-01",
                "Inicio de la saga Fundación",
                "Blanda",
                "978-0-553-80371-0",
                10,
                "portada.jpg",
                "Normal",
                20.00,
                categoria,
                autor
        );

        System.out.println("=== Información del Libro ===");
        System.out.println(libro.toString());
    }
}
