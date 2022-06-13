package com.dh.movie.controller;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.entity.Movie;
import com.dh.movie.repository.MovieRepository;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private MovieRepository repository;
    @Autowired
    private MovieService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody MovieDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/{genre}")
    public MovieDTO findByGenre(@PathVariable String genre) {

        return service.findByGenre(genre);
    }
}
