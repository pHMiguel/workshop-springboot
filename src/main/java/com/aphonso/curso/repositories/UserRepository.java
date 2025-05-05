package com.aphonso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aphonso.curso.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
