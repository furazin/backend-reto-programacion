package com.autentia.catalogocursos.springbootmybatis.controllers;

import com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers.dto.ProfesorDTO;
import com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers.ProfesorMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfesorControllerTest {

    @Mock
    ProfesorMapper profesorMapper;

    @Autowired
    ProfesorController profesorController;

    @Test
    public void getAll() {
        List<ProfesorDTO> profesores = new ArrayList<>();
        ProfesorDTO profesor = new ProfesorDTO(new Long(1), "Rubén", "Aguilera");
        profesores.add(profesor);
        Mockito.when(profesorMapper.findAll()).thenReturn(profesores);
        Assert.assertEquals(profesorController.getAll().getStatusCode(), HttpStatus.OK);
    }
}