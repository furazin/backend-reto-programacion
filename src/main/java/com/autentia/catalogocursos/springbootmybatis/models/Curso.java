package com.autentia.catalogocursos.springbootmybatis.models;


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

    private String activo;

    private String nombreProfesor;

    private String apellidosProfesor;

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", nivel='" + nivel + '\'' +
                ", numHoras='" + numHoras + '\'' +
                ", activo='" + activo + '\'' +
                ", nombreProfesor='" + nombreProfesor + '\'' +
                ", apellidosProfesor='" + apellidosProfesor + '\'' +
                '}';
    }
}
