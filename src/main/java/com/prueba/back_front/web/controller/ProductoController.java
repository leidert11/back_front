package com.prueba.back_front.web.controller;

import com.prueba.back_front.domain.service.ProductoService;
import com.prueba.back_front.persistence.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/filtrar")
    public List<Producto> filtrarProductosPorNombre(@RequestParam String nombre) {
        return productoService.filtrarProductosPorNombre(nombre);
    }
}