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
        catalog.setGenre(dto.getGenre());
        repository.save(catalog);
    }

    @Override
    public Catalog findCatalogByMovie(String genre) {
        var movie = repository.findByGenre(genre);
        return movie;
    }

    @Override
    public Long findByGenre(String genre) {
        var catalog = repository.findByGenre(genre);
        return catalog.getId();
    }
}
