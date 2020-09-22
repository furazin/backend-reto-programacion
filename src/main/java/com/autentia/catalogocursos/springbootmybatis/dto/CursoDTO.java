package com.autentia.catalogocursos.springbootmybatis.dto;

import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class CursoDTO {

    public CursoDTO(Long id, String titulo, String nivel, String numHoras, Boolean activo, String nombreProfesor, String apellidosProfesor, String temario) {
        this.id = id;
        this.titulo = titulo;
        this.nivel = nivel;
        this.numHoras = numHoras;
        this.activo = activo;
        this.nombreProfesor = nombreProfesor;
        this.apellidosProfesor = apellidosProfesor;
        this.temario = temario;
    }

    private Long id;

    private String titulo;

    private String nivel;

    private String numHoras;

    private Boolean activo;

    private String nombreProfesor;

    private String apellidosProfesor;

    private String temario;

    public Curso convertToEntity() {
        ModelMapper modelMapper = new ModelMapper();
        Curso curso = modelMapper.map(this, Curso.class);

        return curso;
    }
}
