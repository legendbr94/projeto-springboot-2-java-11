package com.pedro.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
