package com.distribuida.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTestUnitario {
    private Categoria categoria;
    @BeforeEach
    public void setUp() {
        categoria = new Categoria(1, "Terror", "Libros de terror y suspenso");
    }

    @Test
    public void testCategoriaConstructor() {
        assertAll("Validar Constructor - Categoria",
                () -> assertEquals(1, categoria.getIdCategoria()),
                () -> assertEquals("Terror", categoria.getCategoria()),
                () -> assertEquals("Libros de terror y suspenso", categoria.getDescripcion())
        );
    }

    @Test
    public void testCategoriaSetters() {
        categoria.setIdCategoria(2);
        categoria.setCategoria("Drama");
        categoria.setDescripcion("Libros dramáticos");

        assertAll("Validar Setters - Categoria",
                () -> assertEquals(2, categoria.getIdCategoria()),
                () -> assertEquals("Drama", categoria.getCategoria()),
                () -> assertEquals("Libros dramáticos", categoria.getDescripcion())
        );
    }

    @Test
    public void testCategoriaToString() {
        String str = categoria.toString();

        assertAll("Validar toString - Categoria",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Terror")),
                () -> assertTrue(str.contains("Libros de terror y suspenso"))
        );
    }
}
