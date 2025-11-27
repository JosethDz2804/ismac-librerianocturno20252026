package com.distribuida.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTestUnitario {
    private Libro libro;
    private Categoria categoria;
    private Autor autor;

    @BeforeEach
    public void setUp() {

        categoria = new Categoria(1, "Novela", "Novelas clásicas");
        autor = new Autor(1, "Gabriel", "García Márquez", "Colombia", "Calle 1", "0999999999", "gabriel@correo.com");

        libro = new Libro(
                1,
                "Cien Años de Soledad",
                "Sudamericana",
                471,
                "Primera",
                "Español",
                new Date(),
                "Descripción",
                "Dura",
                "123456789",
                5,
                "portada.jpg",
                "Tapa dura",
                20.5,
                categoria,
                autor
        );
    }

    @Test
    public void testLibroConstructor() {
        assertAll("Validar Constructor - Libro",
                () -> assertEquals(1, libro.getIdLibro()),
                () -> assertEquals("Cien Años de Soledad", libro.getTitulo()),
                () -> assertEquals("Sudamericana", libro.getEditorial()),
                () -> assertEquals(471, libro.getNumPaginas()),
                () -> assertEquals("Primera", libro.getEdicion()),
                () -> assertEquals("Español", libro.getIdioma()),
                () -> assertEquals("Dura", libro.getTipoPasta()),
                () -> assertEquals("123456789", libro.getiSBN()),
                () -> assertEquals(5, libro.getNumEjemplares()),
                () -> assertEquals(20.5, libro.getPrecio()),
                () -> assertEquals(categoria, libro.getCategoria()),
                () -> assertEquals(autor, libro.getAutor())
        );
    }

    @Test
    public void testLibroSetters() {
        libro.setIdLibro(2);
        libro.setTitulo("El Coronel NO Tiene Quien Le Escriba");
        libro.setPrecio(15.0);

        assertAll("Validar setters - Libro",
                () -> assertEquals(2, libro.getIdLibro()),
                () -> assertEquals("El Coronel NO Tiene Quien Le Escriba", libro.getTitulo()),
                () -> assertEquals(15.0, libro.getPrecio())
        );
    }

    @Test
    public void testLibroToString() {
        String str = libro.toString();

        assertAll("Validar toString - Libro",
                () -> assertTrue(str.contains("Cien Años de Soledad")),
                () -> assertTrue(str.contains("Sudamericana")),
                () -> assertTrue(str.contains("471")),
                () -> assertTrue(str.contains("20.5")),
                () -> assertTrue(str.contains("Novela")),
                () -> assertTrue(str.contains("Gabriel"))
        );
    }
}
