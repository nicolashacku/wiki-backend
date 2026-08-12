package com.javeriana.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String redirigirAlInicio() {
        return "redirect:/grupo";
    }

    @GetMapping("/grupo")
    public String mostrarGrupo() {
        return "grupo";
    }
}
