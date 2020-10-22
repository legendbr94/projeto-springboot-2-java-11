package com.pedro.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
