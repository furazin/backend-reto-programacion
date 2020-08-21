package com.autentia.catalogocursos.springbootmybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ProfesorDTO {
    Long id;

    String nombre;

    String apellidos;
}
