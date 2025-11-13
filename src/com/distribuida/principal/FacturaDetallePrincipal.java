package com.distribuida.principal;

import com.distribuida.beans.*;
import java.util.Date;

/**
 * Clase de prueba para FacturaDetalle, relacionando Factura y Libro.
 */
public class FacturaDetallePrincipal {

    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente(1, "1105567890", "Monkis", "Diaz", "Quito", "0998765432", "monkis@example.com");

        // Crear factura
        Factura factura = new Factura(1, "FAC-002", new Date(), 40.0, 4.8, 44.8, cliente);

        // Crear autor y categoría
        Categoria categoria = new Categoria(1, "Ciencia Ficción", "Libros de tecnología y futuro");
        Autor autor = new Autor(1, "EE.UU.", "Isaac", "Asimov", "New York", "0987654321", "asimov@example.com");

        // Crear libro
        Libro libro = new Libro(
                1,
                "Yo, Robot",
                "Gnome Press",
                253,
                "1ra edición",
                "Inglés",
                "1950-12-02",
                "Colección de relatos sobre robots",
                "Dura",
                "978-0-553-29438-9",
                5,
                "portada_robot.jpg",
                "Tapa dura",
                22.50,
                categoria,
                autor
        );

        // Crear detalle de factura
        FacturaDetalle detalle = new FacturaDetalle(1, 2, libro.getPrecio() * 2, factura, libro);

        System.out.println("=== Detalle de Factura ===");
        System.out.println(detalle.toString());
    }
}
