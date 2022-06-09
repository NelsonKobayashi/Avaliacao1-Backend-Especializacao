package com.dh.catalog;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="catalog")
@Data
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
}
