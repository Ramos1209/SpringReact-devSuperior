package com.pauloramos.dsmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pauloramos.dsmovie.dto.MovieDTO;
import com.pauloramos.dsmovie.service.MovieService;

@RestController
@RequestMapping(value ="/movies")
public class MovieController {
	
	
	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO>findAll(Pageable pageable){
		return service.FindAll(pageable);
	}
	
	@GetMapping(value= "/{id}")
	public MovieDTO findById(Long id){
		return service.FindbyId(id);
	}
	
	

}
