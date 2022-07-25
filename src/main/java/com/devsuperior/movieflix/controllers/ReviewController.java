package com.devsuperior.movieflix.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.services.ReviewService;

@RestController
@RequestMapping(value = "/reviews")
public class ReviewController {

	private ReviewService service;
	
	@GetMapping
	public ResponseEntity<ReviewDTO> newReview(){
		return null;
		
	}
}
