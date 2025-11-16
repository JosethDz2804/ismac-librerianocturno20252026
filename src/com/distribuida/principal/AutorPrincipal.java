package com.distribuida.principal;
import com.distribuida.beans.Autor;
/**
 * Clase de prueba para la entidad Autor.
 */
public class AutorPrincipal {

    public static void main(String[] args) {

        Autor autor = new Autor(
                1,
                "Ecuador",
                "Gabriel",
                "Mora",
                "Guayaquil",
                "0991234567",
                "autor@example.com"
        );

        System.out.println("=== Información del Autor ===");
        System.out.println(autor.obtenerInformacion());
        System.out.println(autor.toString());
    }
}
