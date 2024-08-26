package com.test.movie.info.service.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@EntityScan
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	
	private String movieId;
	private String name;

}
