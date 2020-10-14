package com.autentia.catalogocursos.springbootmybatis.repository.impl.converters;

import com.autentia.catalogocursos.springbootmybatis.domain.Curso;
import com.autentia.catalogocursos.springbootmybatis.domain.Profesor;
import com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers.dto.CursoDTO;

public class CursoDtoToEntity {

    public Curso convertToEntity(CursoDTO cursoDto) {
        return new Curso(cursoDto.getId(),
                                cursoDto.getTitulo(),
                                cursoDto.getNivel(),
                                cursoDto.getNumHoras(),
                                cursoDto.getActivo(),
                                new Profesor(cursoDto.getId(), cursoDto.getNombreProfesor(), cursoDto.getApellidosProfesor()),
                                cursoDto.getTemario());

    }
}
