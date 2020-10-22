package com.pedro.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.projeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
