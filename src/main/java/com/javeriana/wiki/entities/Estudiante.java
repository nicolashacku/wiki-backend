package com.javeriana.wiki.entities;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Estudiante {

    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private int semestre;
    private String imgaeUrl;
    private String descripcion;

}
