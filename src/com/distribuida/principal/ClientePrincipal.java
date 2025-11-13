package com.distribuida.principal;

import com.distribuida.beans.Cliente;

/**
 * Clase de prueba para la entidad Cliente.
 * Se encarga de crear un objeto Cliente y mostrar sus datos.
 */
public class ClientePrincipal {

    public static void main(String[] args) {

        // Crear un cliente
        Cliente cliente = new Cliente(
                1,
                "1105567890",
                "Monkis",
                "Diaz",
                "Quito - Ecuador",
                "0998765432",
                "monkis@example.com"
        );

        // Mostrar información del cliente
        System.out.println("=== Información del Cliente ===");
        System.out.println(cliente.obtenerInformacion());
        System.out.println(cliente.toString());
    }
}
