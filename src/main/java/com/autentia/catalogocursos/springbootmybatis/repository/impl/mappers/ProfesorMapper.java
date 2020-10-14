package com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers;

import com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers.dto.ProfesorDTO;
import com.autentia.catalogocursos.springbootmybatis.domain.Profesor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProfesorMapper {

    @Select("select * from profesor")
    List<ProfesorDTO> findAll();

    @Select("select id, nombre, apellidos from profesor where id = #{id}")
    Profesor findById(Long id);

    @Insert("INSERT INTO profesor(nombre, apellidos) " +
            "VALUES (#{nombre}, #{apellidos})")
    void insert(Profesor profesor);
}
