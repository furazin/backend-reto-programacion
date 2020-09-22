package com.autentia.catalogocursos.springbootmybatis.services.impl;

import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import com.autentia.catalogocursos.springbootmybatis.repository.CursoRepository;
import com.autentia.catalogocursos.springbootmybatis.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    CursoRepository cursoRepository;

    @Override
    public List<Curso> getAll() {
        return cursoRepository.getAll();
    }

    @Override
    public List<Curso> getAllCursosActivos() {
        return cursoRepository.getAllCursosActivos();
    }

    @Override
    public void insert(Curso curso) {
        cursoRepository.insert(curso);
    }
}
