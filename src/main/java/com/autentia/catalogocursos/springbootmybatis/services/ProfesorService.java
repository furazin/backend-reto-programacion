package com.autentia.catalogocursos.springbootmybatis.services;

import com.autentia.catalogocursos.springbootmybatis.dto.ProfesorDTO;
import com.autentia.catalogocursos.springbootmybatis.models.Profesor;

import java.util.List;

public interface ProfesorService {

    List<ProfesorDTO> getAllProfesores();

    void insert(Profesor profesor);
}
