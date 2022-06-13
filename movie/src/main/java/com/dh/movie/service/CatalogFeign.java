package com.dh.movie.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "CATALOG")
public interface CatalogFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/{genre}")
    Long findByGenre(@PathVariable(value = "genre") String nameCatalog);
}
