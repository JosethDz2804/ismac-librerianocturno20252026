package com.distribuida.beans;
import java.util.Date;
/**
 * Representa una factura, asociada a un cliente.
 */
public class Factura {

    private int idFactura;
    private String numFactura;
    private Date fecha;
    private double totalNeto;
    private double iva;
    private double total;

    private Cliente cliente;

    public Factura() {}

    public Factura(int idFactura, String numFactura, Date fecha,
                   double totalNeto, double iva, double total, Cliente cliente) {
        this.idFactura = idFactura;
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.totalNeto = totalNeto;
        this.iva = iva;
        this.total = total;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", numFactura='" + numFactura + '\'' +
                ", fecha=" + fecha +
                ", total=" + total +
                ", cliente=" + cliente +
                '}';
    }
}
