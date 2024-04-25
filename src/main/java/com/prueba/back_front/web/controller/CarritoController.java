package com.prueba.back_front.web.controller;

import com.prueba.back_front.domain.service.CarritoService;
import com.prueba.back_front.persistence.Carrito;
import com.prueba.back_front.persistence.DetalleCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping("/{idCliente}")
    public Carrito obtenerCarrito(@PathVariable int idCliente) {
        return carritoService.obtenerCarrito(idCliente);
    }


}
