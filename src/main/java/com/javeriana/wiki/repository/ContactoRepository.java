package com.javeriana.wiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javeriana.wiki.entities.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
