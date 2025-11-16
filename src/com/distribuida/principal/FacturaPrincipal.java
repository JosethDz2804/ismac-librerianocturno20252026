package com.distribuida.principal;
import com.distribuida.beans.*;
import java.util.Date;
/**
 * Clase de prueba para la entidad Factura, relacionando con Cliente.
 */
public class FacturaPrincipal {
    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente(
                1,
                "1105567890",
                "Monkis",
                "Diaz",
                "Quito - Ecuador",
                "0998765432",
                "monkis@example.com"
        );

        // Crear factura
        Factura factura = new Factura(
                1,
                "FAC-001",
                new Date(),
                100.0,
                12.0,
                112.0,
                cliente
        );

        System.out.println("=== Información de la Factura ===");
        System.out.println(factura.toString());
    }
}
