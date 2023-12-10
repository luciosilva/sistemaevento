package com.devsuperior.sistemaevento.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Bloco {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
