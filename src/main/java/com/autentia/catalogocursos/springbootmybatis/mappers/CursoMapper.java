package com.autentia.catalogocursos.springbootmybatis.mappers;

import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CursoMapper {

    @Select("select * from curso")
    public List<Curso> findAll();

    @Insert("INSERT INTO curso(id, titulo, nivel, numHoras, activo, nombreProfesor, apellidosProfesor) " +
            "VALUES (#{id}, #{titulo}, #{nivel}, #{numHoras}, #{activo}, #{nombreProfesor}, #{apellidosProfesor})")
    void insert(Curso curso);
}
