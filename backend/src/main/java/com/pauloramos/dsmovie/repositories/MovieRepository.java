package com.pauloramos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pauloramos.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
