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
                estudiante = new Estudiante(1, "Jhony", "Martinez", "jonathanmartinez@javeriana.edu.co", 20, 6, "jhony.jpg", "Estudiante apasionado por la tecnología y ciberseguridad.");
                break;
            case "nicolas":
                estudiante = new Estudiante(2, "Nicolas", "Jimenez", "jimenez_nicolase@javeriana.edu.co", 20, 6, "nicolas.png", "Amante de la programación y hacer apps web.");
                break;
            case "xamu":
                estudiante = new Estudiante(3, "Xamuel", "Perez", "xamuel_perez@example.com", 20, 6, "xamu.png", "Apasionado por la inteligencia artificial.");
                break;
            case "juandi":
                estudiante = new Estudiante(4, "Juandi", "Funeme", "juan.funeme@javeriana.edu.co", 19, 6, "juandi.png", "Interesado en el desarrollo de videojuegos.");
                break;
            default:
                model.addAttribute("error", "Estudiante no encontrado");
                return "error";
        }

        model.addAttribute("estudiante", estudiante);
        return "estudiante"; 
    }
}