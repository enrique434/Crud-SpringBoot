package com.kikecrud.crudkike.controller;

import com.kikecrud.crudkike.model.ProductoModel;
import com.kikecrud.crudkike.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    public ProductoRepository productoRepository;

    @GetMapping("/producto")
    public Iterable<ProductoModel> getAllProductos() {
        return productoRepository.findAll();
    }

    @PostMapping("/producto/new")
    public ProductoModel saveProducto(@RequestBody ProductoModel producto) {
        return productoRepository.save(producto);
    }
    @DeleteMapping(value = "/producto/delete/{id}")
    public void deleteProducto(@PathVariable Integer id) {
        productoRepository.deleteById(id);
    }

}
