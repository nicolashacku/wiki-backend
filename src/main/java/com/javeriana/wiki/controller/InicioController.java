package com.javeriana.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javeriana.wiki.repository.EstudianteRepository;

@Controller
public class InicioController {

    private final EstudianteRepository estudianteRepository;

    public InicioController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @GetMapping("/")
    public String redirigirAlInicio() {
        return "redirect:/grupo";
    }

    @GetMapping("/grupo")
    public String mostrarGrupo(Model model) {

        model.addAttribute(
                "estudiantes",
                estudianteRepository.findAll()
        );

        return "grupo";
    }
}