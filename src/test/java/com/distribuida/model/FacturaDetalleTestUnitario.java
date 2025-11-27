package com.distribuida.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class FacturaDetalleTestUnitario {
    private Factura factura;
    private Libro libro;
    private FacturaDetalle detalle;

    @BeforeEach
    public void setUp() {
        factura = new Factura();
        factura.setIdFactura(1);
        factura.setNumFactura("FAC-001");
        factura.setFecha(new Date());
        factura.setTotal(50.0);

        libro = new Libro();
        libro.setIdLibro(10);
        libro.setTitulo("Cien Años de Soledad");
        libro.setPrecio(20.0);

        detalle = new FacturaDetalle(1, 2, 40.0, factura, libro);
    }

    @Test
    public void testFacturaDetalleConstructor() {
        assertAll("Validar constructor - FacturaDetalle",
                () -> assertEquals(1, detalle.getIdFacturaDetalle()),
                () -> assertEquals(2, detalle.getCantidad()),
                () -> assertEquals(40.0, detalle.getSubtotal()),
                () -> assertEquals(factura, detalle.getFactura()),
                () -> assertEquals(libro, detalle.getLibro())
        );
    }

    @Test
    public void testFacturaDetalleSetters() {
        Factura factura2 = new Factura();
        factura2.setIdFactura(2);

        Libro libro2 = new Libro();
        libro2.setIdLibro(20);

        detalle.setIdFacturaDetalle(3);
        detalle.setCantidad(5);
        detalle.setSubtotal(100.0);
        detalle.setFactura(factura2);
        detalle.setLibro(libro2);

        assertAll("Validar Setters - FacturaDetalle",
                () -> assertEquals(3, detalle.getIdFacturaDetalle()),
                () -> assertEquals(5, detalle.getCantidad()),
                () -> assertEquals(100.0, detalle.getSubtotal()),
                () -> assertEquals(factura2, detalle.getFactura()),
                () -> assertEquals(libro2, detalle.getLibro())
        );
    }

    @Test
    public void testFacturaDetalleToString() {
        String str = detalle.toString();

        assertAll("Validar toString - FacturaDetalle",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("2")),
                () -> assertTrue(str.contains("40.0")),
                () -> assertTrue(str.contains("Cien Años de Soledad"))
        );
    }
}
