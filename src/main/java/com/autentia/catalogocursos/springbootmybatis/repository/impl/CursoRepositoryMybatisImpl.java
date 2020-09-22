package com.autentia.catalogocursos.springbootmybatis.repository.impl;

import com.autentia.catalogocursos.springbootmybatis.dto.CursoDTO;
import com.autentia.catalogocursos.springbootmybatis.mappers.CursoMapper;
import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import com.autentia.catalogocursos.springbootmybatis.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursoRepositoryMybatisImpl implements CursoRepository {

    @Autowired
    CursoMapper cursoMapper;

    @Override
    public List<Curso> getAll() {
        List<CursoDTO> listCursoDto =  cursoMapper.findAll();
        ArrayList<Curso> listCursos = new ArrayList<>();
        listCursoDto.stream().forEach((c) -> listCursos.add(c.convertToEntity()));

        return listCursos;
    }

    @Override
    public List<Curso> getAllCursosActivos() {
        List<CursoDTO> listCursoDto = cursoMapper.findAllCursosActivos();
        ArrayList<Curso> listCursos = new ArrayList<>();
        listCursoDto.stream().forEach((c) -> listCursos.add(c.convertToEntity()));

        return listCursos;
    }

    @Override
    public void insert(Curso curso) {
        cursoMapper.insert(curso);
    }
}
