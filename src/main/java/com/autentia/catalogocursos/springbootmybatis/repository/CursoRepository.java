package com.autentia.catalogocursos.springbootmybatis.repository;

import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository {
    List<Curso> getAll();

    List<Curso> getAllCursosActivos();

    void insert(Curso curso);
}
