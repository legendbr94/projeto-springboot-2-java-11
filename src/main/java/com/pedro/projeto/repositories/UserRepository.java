package com.pedro.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
