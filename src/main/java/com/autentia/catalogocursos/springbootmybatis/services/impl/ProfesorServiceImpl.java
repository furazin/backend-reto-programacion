package com.autentia.catalogocursos.springbootmybatis.services.impl;

import com.autentia.catalogocursos.springbootmybatis.dto.ProfesorDTO;
import com.autentia.catalogocursos.springbootmybatis.mappers.ProfesorMapper;
import com.autentia.catalogocursos.springbootmybatis.models.Profesor;
import com.autentia.catalogocursos.springbootmybatis.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    ProfesorMapper profesorMapper;

    @Override
    public List<ProfesorDTO> getAllProfesores() {
        return profesorMapper.findAll();
    }

    @Override
    public void insert(Profesor profesor) {
        profesorMapper.insert(profesor);
    }
}
