package com.dh.movie.service.impl;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.entity.Movie;
import com.dh.movie.repository.MovieRepository;
import com.dh.movie.service.CatalogFeign;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;

    @Override
    public void save(MovieDTO dto) {
        Movie movie = new Movie();
        movie.setName(dto.getName());
        movie.setCatalogId(null);
        repository.save(movie);
    }

    @Override
    public MovieDTO findByGenre(String genre) {
        return null;
    }

}
