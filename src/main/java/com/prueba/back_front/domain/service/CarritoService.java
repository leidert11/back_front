package com.prueba.back_front.domain.service;

import com.prueba.back_front.domain.repository.CarritoRepository;
import com.prueba.back_front.domain.repository.DetalleCarritoRepository;
import com.prueba.back_front.domain.repository.ProductoRepository;
import com.prueba.back_front.persistence.Carrito;
import com.prueba.back_front.persistence.DetalleCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    @Autowired
    private DetalleCarritoRepository detalleCarritoRepository;

    @Autowired
    private ProductoRepository productoRepository;

    public Carrito obtenerCarrito(int idCliente) {
        return carritoRepository.findById(idCliente).orElse(null);
    }


}