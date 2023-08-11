package com.example2.MoviesProject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService 
{
	@Autowired
	private MovieRepo repo;
	
	public List<Movies> allMovies()
	{
		return repo.findAll();
	}
	
	public Optional<Movies> singleMovie(String imdbId)
	{
		return repo.findMovieByImdbId(imdbId);
	}
	
}
