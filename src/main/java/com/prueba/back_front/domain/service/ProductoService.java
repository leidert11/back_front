package com.prueba.back_front.domain.service;

import com.prueba.back_front.domain.repository.ProductoRepository;
import com.prueba.back_front.persistence.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> filtrarProductosPorNombre(String nombre) {
        return productoRepository.findByNombreContaining(nombre);
    }
}