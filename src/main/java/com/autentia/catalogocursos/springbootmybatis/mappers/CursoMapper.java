package com.autentia.catalogocursos.springbootmybatis.mappers;

import com.autentia.catalogocursos.springbootmybatis.dto.CursoDTO;
import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CursoMapper {

    @Select("select curso.id, curso.titulo, curso.nivel, curso.numHoras, curso.activo, profesor.nombre, profesor.apellidos " +
            "from curso inner join profesor on curso.profesor_id = profesor.id")
    public List<CursoDTO> findAll();

    @Insert("INSERT INTO curso(id, titulo, nivel, numHoras, activo, profesor_id) " +
            "VALUES (#{id}, #{titulo}, #{nivel}, #{numHoras}, #{activo}, #{profesor_id})")
    void insert(Curso curso);
}
