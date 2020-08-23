package com.autentia.catalogocursos.springbootmybatis.mappers;

import com.autentia.catalogocursos.springbootmybatis.dto.ProfesorDTO;
import com.autentia.catalogocursos.springbootmybatis.models.Profesor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProfesorMapper {

    @Select("select * from profesor")
    List<ProfesorDTO> findAll();

    @Insert("INSERT INTO profesor(nombre, apellidos) " +
            "VALUES (#{nombre}, #{apellidos})")
    void insert(Profesor profesor);
}
