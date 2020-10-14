package com.autentia.catalogocursos.springbootmybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Curso {

    private Long id;

    private String titulo;

    private String nivel;

    private String numHoras;

    private Boolean activo;

    private Profesor profesor;

    private String temario;

}
    