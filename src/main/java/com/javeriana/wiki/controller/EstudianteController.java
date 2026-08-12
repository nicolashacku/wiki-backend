package com.javeriana.wiki.controller;

import com.javeriana.wiki.entities.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

    @GetMapping("/{nombre}")
    public String mostrarEstudiante(@PathVariable String nombre, Model model) {
        Estudiante estudiante;

        switch (nombre.toLowerCase()) {
            case "jhony":
                estudiante = new Estudiante(1, "Jhony", "Hacku", "jhony@example.com", 20, 5, "jhony.jpg", "Estudiante apasionado por la tecnología.");
                break;
            case "nicolas":
                estudiante = new Estudiante(2, "Nicolas", "Perez", "nicolas@example.com", 22, 6, "nicolas.jpg", "Amante de la programación.");
                break;
            case "xamu":
                estudiante = new Estudiante(3, "Xamu", "Lopez", "xamu@example.com", 21, 4, "xamu.jpg", "Interesado en el diseño web.");
                break;
            case "juandi":
                estudiante = new Estudiante(4, "Juandi", "Garcia", "juandi@example.com", 23, 7, "juandi.jpg", "Apasionado por la inteligencia artificial.");
                break;
            default:
                model.addAttribute("error", "Estudiante no encontrado");
                return "error";
        }

        model.addAttribute("estudiante", estudiante);
        return "estudiante"; // Retorna una vista genérica "estudiante.html"
    }
}