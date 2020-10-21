package com.autentia.catalogocursos.springbootmybatis.domain.ports;

import com.autentia.catalogocursos.springbootmybatis.domain.Curso;

import java.sql.SQLException;
import java.util.List;

public interface CursoRepository {
        List<Curso> getAll();

        List<Curso> getAllCursosActivos();

        void insert(Curso curso) throws SQLException;
}
