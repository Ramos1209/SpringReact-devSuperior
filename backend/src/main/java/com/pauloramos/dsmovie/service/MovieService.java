package com.pauloramos.dsmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pauloramos.dsmovie.dto.MovieDTO;
import com.pauloramos.dsmovie.entities.Movie;
import com.pauloramos.dsmovie.repositories.MovieRepository;


@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO>FindAll(Pageable pageable){
	 Page<Movie> result = repository.findAll(pageable);
	 Page<MovieDTO> page = result.map(x-> new MovieDTO(x));
	 return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO FindbyId(Long id){
		 Movie result = repository.findById(id).get();
		 MovieDTO dto = new MovieDTO(result);
		 return dto;
		}
	
}
