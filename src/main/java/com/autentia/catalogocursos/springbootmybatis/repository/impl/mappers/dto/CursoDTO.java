package com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers.dto;

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

    private Boolean activo;

    private Long profesor_id;

    private String nombreProfesor;

    private String apellidosProfesor;

    private String temario;
}
