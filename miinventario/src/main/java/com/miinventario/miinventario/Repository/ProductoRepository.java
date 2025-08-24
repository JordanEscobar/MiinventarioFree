package com.miinventario.miinventario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miinventario.miinventario.Entity.ProductoEntity;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer>{

}
