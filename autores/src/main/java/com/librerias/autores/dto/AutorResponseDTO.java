package com.librerias.autores.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AutorResponseDTO {

    private Long id;
    private String nombre;
    private String nacionalidad;
}
