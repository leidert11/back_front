package com.prueba.back_front.persistence.DTO;


public class ProductoDTO {
    private Integer id;
    private String nombre;
    private String descripcion;
    private double precio;
    private Integer cantidad_en_stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getCantidad_en_stock() {
        return cantidad_en_stock;
    }

    public void setCantidad_en_stock(Integer cantidad_en_stock) {
        this.cantidad_en_stock = cantidad_en_stock;
    }
}
