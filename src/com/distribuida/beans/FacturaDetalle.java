package com.distribuida.beans;

/**
 * Representa el detalle de una factura, relacionando Factura y Libro.
 */
public class FacturaDetalle {

    private int idFacturaDetalle;
    private int cantidad;
    private double subtotal;

    private Factura factura;
    private Libro libro;

    public FacturaDetalle() {}

    public FacturaDetalle(int idFacturaDetalle, int cantidad, double subtotal,
                          Factura factura, Libro libro) {
        this.idFacturaDetalle = idFacturaDetalle;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.factura = factura;
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" +
                "idFacturaDetalle=" + idFacturaDetalle +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                ", factura=" + factura +
                ", libro=" + libro +
                '}';
    }
}
