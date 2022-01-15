package com.pauloramos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pauloramos.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
