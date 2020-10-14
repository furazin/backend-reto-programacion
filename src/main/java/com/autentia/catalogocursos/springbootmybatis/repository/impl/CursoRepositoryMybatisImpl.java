package com.autentia.catalogocursos.springbootmybatis.repository.impl;

import com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers.CursoMapper;
import com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers.dto.CursoDTO;
import com.autentia.catalogocursos.springbootmybatis.domain.Curso;
import com.autentia.catalogocursos.springbootmybatis.domain.ports.CursoRepository;
import com.autentia.catalogocursos.springbootmybatis.repository.impl.converters.CursoDtoToEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CursoRepositoryMybatisImpl implements CursoRepository {

    @Autowired
    CursoMapper cursoMapper;

    @Override
    public List<Curso> getAll() {
        List<CursoDTO> listCursoDto =  cursoMapper.findAll();
        return listCursoDto.stream().map((c) -> new CursoDtoToEntity().convertToEntity(c)).collect(Collectors.toList());
    }

    @Override
    public List<Curso> getAllCursosActivos() {
        List<CursoDTO> listCursoDto = cursoMapper.findAllCursosActivos();
        return listCursoDto.stream().map((c) -> new CursoDtoToEntity().convertToEntity(c)).collect(Collectors.toList());
    }

    @Override
    public void insert(Curso curso) {
        cursoMapper.insert(curso);
    }
}
