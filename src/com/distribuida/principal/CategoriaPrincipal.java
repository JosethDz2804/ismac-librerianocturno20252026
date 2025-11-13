package com.distribuida.principal;

import com.distribuida.beans.Categoria;

/**
 * Clase de prueba para la entidad Categoria.
 */
public class CategoriaPrincipal {

    public static void main(String[] args) {

        Categoria categoria = new Categoria(
                1,
                "Novela",
                "Narraciones literarias de ficción"
        );

        System.out.println("=== Información de la Categoría ===");
        System.out.println(categoria.toString());
    }
}
