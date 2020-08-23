package com.autentia.catalogocursos.springbootmybatis.services;

import com.autentia.catalogocursos.springbootmybatis.dto.CursoDTO;
import com.autentia.catalogocursos.springbootmybatis.models.Curso;

import java.util.List;

public interface CursoService {

    List<CursoDTO> getAll();

    List<CursoDTO> getAllCursosActivos();

    void insert(Curso curso);
}
