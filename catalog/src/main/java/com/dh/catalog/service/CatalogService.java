package com.dh.catalog.service;

import com.dh.catalog.Catalog;
import com.dh.catalog.dto.CatalogDTO;

public interface CatalogService {
    void save(CatalogDTO dto);

    Catalog findCatalogByMovie(String genre);

    Long findByGenre(String genre);
}
