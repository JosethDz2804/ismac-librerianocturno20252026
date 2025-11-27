package com.distribuida.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTestUnitario {
    private Autor autor;
    @BeforeEach
    public void setUp() {
        autor = new Autor(
                1,
                "Gabriel",
                "García Márquez",
                "Colombia",
                "Calle 1",
                "0999999999",
                "gabriel@correo.com"
        );
    }

    @Test
    public void testAutorConstructor() {
        assertAll("Validar datos del Autor - Constructor",
                () -> assertEquals(1, autor.getIdAutor()),
                () -> assertEquals("Gabriel", autor.getNombre()),
                () -> assertEquals("García Márquez", autor.getApellido()),
                () -> assertEquals("Colombia", autor.getPais()),
                () -> assertEquals("Calle 1", autor.getDireccion()),
                () -> assertEquals("0999999999", autor.getTelefono()),
                () -> assertEquals("gabriel@correo.com", autor.getCorreo())
        );
    }

    @Test
    public void testAutorSetters() {
        autor.setIdAutor(2);
        autor.setNombre("Mario");
        autor.setApellido("Vargas Llosa");
        autor.setPais("Perú");
        autor.setDireccion("Av 2");
        autor.setTelefono("0888888888");
        autor.setCorreo("mario@correo.com");

        assertAll("Validar datos del Autor - Setters",
                () -> assertEquals(2, autor.getIdAutor()),
                () -> assertEquals("Mario", autor.getNombre()),
                () -> assertEquals("Vargas Llosa", autor.getApellido()),
                () -> assertEquals("Perú", autor.getPais()),
                () -> assertEquals("Av 2", autor.getDireccion()),
                () -> assertEquals("0888888888", autor.getTelefono()),
                () -> assertEquals("mario@correo.com", autor.getCorreo())
        );
    }

    @Test
    public void testAutorToString() {
        String str = autor.toString();

        assertAll("Validar toString - Autor",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Gabriel")),
                () -> assertTrue(str.contains("García Márquez")),
                () -> assertTrue(str.contains("Colombia")),
                () -> assertTrue(str.contains("Calle 1")),
                () -> assertTrue(str.contains("0999999999")),
                () -> assertTrue(str.contains("gabriel@correo.com"))
        );
    }
}
