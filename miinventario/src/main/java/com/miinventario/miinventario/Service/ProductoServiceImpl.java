package com.miinventario.miinventario.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miinventario.miinventario.Entity.ProductoEntity;
import com.miinventario.miinventario.Repository.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepo)
    {
        this.productoRepository = productoRepo;
    }

    @Override
    @Transactional
    public List<ProductoEntity> getAll() {
        return productoRepository.findAll();
    }

}
