package com.autentia.catalogocursos.springbootmybatis.mappers;

import com.autentia.catalogocursos.springbootmybatis.models.Profesor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProfesorMapper {

    @Select("select * from profesor")
    public List<Profesor> findAll();

    @Insert("INSERT INTO profesor(id, nombre, apellidos) " +
            "VALUES (#{id}, #{nombre}, #{apellidos})")
    void insert(Profesor profesor);
}
