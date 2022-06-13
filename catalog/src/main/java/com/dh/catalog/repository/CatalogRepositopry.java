package com.dh.catalog.repository;

import com.dh.catalog.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepositopry extends JpaRepository<Catalog, Long> {

    Catalog findByGenre(String genre);
}
