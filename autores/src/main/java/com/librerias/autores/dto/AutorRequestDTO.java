package com.librerias.autores.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AutorRequestDTO {

    @NotBlank
    private String nombre;

    @NotBlank
    private String nacionalidad;
}
