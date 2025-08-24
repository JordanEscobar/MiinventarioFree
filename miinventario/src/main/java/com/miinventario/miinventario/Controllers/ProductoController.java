package com.miinventario.miinventario.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miinventario.miinventario.Entity.ProductoEntity;
import com.miinventario.miinventario.Service.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoS){
        this.productoService = productoS;
    }

    @GetMapping("/productos")
    public List<ProductoEntity> getAll()
    {
        List<ProductoEntity> productos = productoService.getAll();
        return productos;
    }

}
