package com.javeriana.wiki.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javeriana.wiki.entities.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

    Optional<Estudiante> findByNombreIgnoreCase(String nombre);
}