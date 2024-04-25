package com.prueba.back_front.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private double precio;

    @Column(name = "cantidad_en_stock")
    private int cantidadEnStock;

    @OneToMany(mappedBy = "producto")
    private List<DetallePedido> detallePedidos;

    @OneToMany(mappedBy = "producto")
    private List<DetalleCarrito> detalleCarritos;

    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, double precio, int cantidadEnStock, List<DetallePedido> detallePedidos, List<DetalleCarrito> detalleCarritos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.detallePedidos = detallePedidos;
        this.detalleCarritos = detalleCarritos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public List<DetallePedido> getDetallePedidos() {
        return detallePedidos;
    }

    public void setDetallePedidos(List<DetallePedido> detallePedidos) {
        this.detallePedidos = detallePedidos;
    }

    public List<DetalleCarrito> getDetalleCarritos() {
        return detalleCarritos;
    }

    public void setDetalleCarritos(List<DetalleCarrito> detalleCarritos) {
        this.detalleCarritos = detalleCarritos;
    }
}

