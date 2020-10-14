package com.autentia.catalogocursos.springbootmybatis.ViewAdapters;

import com.autentia.catalogocursos.springbootmybatis.domain.Curso;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CursoViewAdapter {

    private Long id;

    private String titulo;

    private String nivel;

    private String numHoras;

    private String nombreProfesor;

    private String apellidosProfesor;

    private String temario;

    public CursoViewAdapter(Curso curso) {
        this.id = curso.getId();
        this.titulo = curso.getTitulo();
        this.nivel = curso.getNivel();
        this.numHoras = curso.getNumHoras();
        this.nombreProfesor = curso.getProfesor().getNombre();
        this.apellidosProfesor = curso.getProfesor().getApellidos();
        this.temario = curso.getTemario();
    }
}
