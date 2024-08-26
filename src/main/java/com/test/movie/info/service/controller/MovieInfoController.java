package com.test.movie.info.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.movie.info.service.entity.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	@GetMapping("/info")
	public Movie getMovie() {
		return new Movie("testing", "helloworld");
	}

}
