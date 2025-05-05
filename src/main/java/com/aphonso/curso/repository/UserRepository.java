package com.aphonso.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aphonso.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
