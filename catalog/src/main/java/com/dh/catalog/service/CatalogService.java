package com.dh.catalog.service;

import com.dh.catalog.dto.CatalogDTO;

public interface CatalogService {
    void save(CatalogDTO dto);
    Long findByNome(String nome);

    String findMoviesByNome(String nome);
}
