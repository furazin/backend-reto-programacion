package com.autentia.catalogocursos.springbootmybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CursoDTO {
    private Long id;

    private String titulo;

    private String nivel;

    private String numHoras;

    private String activo;

    private String nombreProfesor;

    private String apellidosProfesor;
}
