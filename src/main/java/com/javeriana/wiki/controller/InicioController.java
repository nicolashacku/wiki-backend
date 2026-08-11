package com.javeriana.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String redirigirAlInicio() {
        return "redirect:/grupo";
    }

    // http://localhost:8080/grupo
    @GetMapping("/grupo")
    public String mostrarGrupo() {
        return "grupo";
    }

    // http://localhost:8080/jhony
    @GetMapping("/jhony")
    public String mostrarJhony() {
        return "jhony";
    }

    // http://localhost:8080/nicolas
    @GetMapping("/nicolas")
    public String mostrarNicolas() { return  "nicolas"; }


    @GetMapping("/xamu")
    public String mostrarXamu() { return  "xamu"; }

    @GetMapping("/juandi")
    public String mostrarJuandi() { return  "juandi"; }
}
