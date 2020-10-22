package com.pedro.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
