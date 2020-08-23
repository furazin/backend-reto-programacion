package com.autentia.catalogocursos.springbootmybatis.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso {

    private String titulo;

    private String nivel;

    private String numHoras;

    private Boolean activo;

    private Long profesor_id;

    private String temario;

    public Curso() {
    }

    public Curso(String titulo, String nivel, String numHoras, Boolean activo, Long profesor_id, String temario) {
        this.titulo = titulo;
        this.nivel = nivel;
        this.numHoras = numHoras;
        this.activo = activo;
        this.profesor_id = profesor_id;
        this.temario = temario;
    }

    public Curso(String titulo, String nivel, String numHoras, Boolean activo, Long profesor_id) {
        this.titulo = titulo;
        this.nivel = nivel;
        this.numHoras = numHoras;
        this.activo = activo;
        this.profesor_id = profesor_id;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo='" + titulo + '\'' +
                ", nivel='" + nivel + '\'' +
                ", numHoras='" + numHoras + '\'' +
                ", activo='" + activo + '\'' +
                ", profesor_id=" + profesor_id +
                '}';
    }
}
    