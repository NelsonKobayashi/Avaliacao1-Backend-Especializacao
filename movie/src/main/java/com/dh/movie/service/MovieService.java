package com.dh.movie.service;

import com.dh.movie.dto.MovieDTO;

public interface MovieService {

    void save(MovieDTO dto);

    MovieDTO findByCatalog(String nomeCatalog);

    String findMovieByCatalogId(Long idCatalog);
}
