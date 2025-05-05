package com.aphonso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aphonso.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
