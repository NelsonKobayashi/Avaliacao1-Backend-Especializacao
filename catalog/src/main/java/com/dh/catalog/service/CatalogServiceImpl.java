package com.dh.catalog.service;

import com.dh.catalog.Catalog;
import com.dh.catalog.dto.CatalogDTO;
import com.dh.catalog.repository.CatalogRepositopry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService{

    @Autowired
    private CatalogRepositopry repository;

    @Autowired
    private MovieFeign movie;

    @Override
    public void save(CatalogDTO dto) {
        Catalog catalog = new Catalog();
        catalog.setNome(dto.getNome());
        repository.save(catalog);
    }

    @Override
    public Long findByNome(String nome) {
        var catalog = repository.findByNome(nome);
        return catalog.getId();
    }

    @Override
    public String findMoviesByNome(String nome) {
        var catalog = repository.findByNome(nome);
        return movie.findNome(catalog.getId());
    }
}
