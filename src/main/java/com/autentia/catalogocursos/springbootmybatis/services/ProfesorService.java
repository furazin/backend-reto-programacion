package com.autentia.catalogocursos.springbootmybatis.services;

import com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers.dto.ProfesorDTO;
import com.autentia.catalogocursos.springbootmybatis.domain.Profesor;

import java.util.List;

public interface ProfesorService {

    List<ProfesorDTO> getAllProfesores();

    void insert(Profesor profesor);
}
