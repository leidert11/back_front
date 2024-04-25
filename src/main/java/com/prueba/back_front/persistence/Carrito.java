package com.prueba.back_front.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;

    @OneToMany(mappedBy = "carrito")
    private List<DetalleCarrito> detalleCarritos;

    public Carrito(int id, Cliente cliente, List<DetalleCarrito> detalleCarritos) {
        this.id = id;
        this.cliente = cliente;
        this.detalleCarritos = detalleCarritos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleCarrito> getDetalleCarritos() {
        return detalleCarritos;
    }

    public void setDetalleCarritos(List<DetalleCarrito> detalleCarritos) {
        this.detalleCarritos = detalleCarritos;
    }
}