package com.javeriana.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javeriana.wiki.repository.EstudianteRepository;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteRepository estudianteRepository;

    public EstudianteController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @GetMapping("/{nombre}")
    public String mostrarEstudiante(@PathVariable String nombre, Model model) {

        return estudianteRepository.findByNombreIgnoreCase(nombre)
                .map(estudiante -> {
                    model.addAttribute("estudiante", estudiante);
                    return "estudiante";
                })
                .orElseGet(() -> {
                    model.addAttribute("error", "Estudiante no encontrado");
                    return "error";
                });
    }
}