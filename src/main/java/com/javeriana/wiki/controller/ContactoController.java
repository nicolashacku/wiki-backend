package com.javeriana.wiki.controller;

import com.javeriana.wiki.entities.Contacto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactoController {

    @GetMapping("/contacto")
    public String mostrarFormulario(Model model) {

        model.addAttribute("contacto", new Contacto());

        return "contacto";
    }

    @PostMapping("/contacto")
    public String procesarFormulario(
            @ModelAttribute Contacto contacto,
            Model model) {

        String mensajeExito =
                "Gracias, " + contacto.getNombre()
                        + ". Tu mensaje fue recibido correctamente.";

        model.addAttribute("mensajeExito", mensajeExito);
        model.addAttribute("contacto", new Contacto());

        return "contacto";
    }
}