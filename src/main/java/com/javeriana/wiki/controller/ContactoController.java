package com.javeriana.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javeriana.wiki.entities.Contacto;
import com.javeriana.wiki.repository.ContactoRepository;

import jakarta.validation.Valid;

@Controller
public class ContactoController {

    private final ContactoRepository contactoRepository;

    public ContactoController(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    @GetMapping("/contacto")
    public String mostrarFormulario(Model model) {
        if (!model.containsAttribute("contacto")) {
            model.addAttribute("contacto", new Contacto());
        }
        return "contacto";
    }

    @PostMapping("/contacto")
    public String procesarFormulario(
            @Valid @ModelAttribute("contacto") Contacto contacto,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("mensajeError", "Por favor, corrige los datos del formulario.");
            return "contacto";
        }

        contactoRepository.save(contacto);

        String mensajeExito =
                "Gracias, " + contacto.getNombre()
                        + ". Tu mensaje fue recibido correctamente.";

        model.addAttribute("mensajeExito", mensajeExito);
        model.addAttribute("contacto", new Contacto());

        return "contacto";
    }
}