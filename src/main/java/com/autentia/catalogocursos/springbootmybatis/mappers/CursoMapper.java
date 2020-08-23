package com.autentia.catalogocursos.springbootmybatis.mappers;

import com.autentia.catalogocursos.springbootmybatis.dto.CursoDTO;
import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CursoMapper {

    @Select("select curso.id, curso.titulo, curso.nivel, curso.numHoras, curso.activo, profesor.nombre, profesor.apellidos, curso.temario " +
            "from curso inner join profesor on curso.profesor_id = profesor.id")
    List<CursoDTO> findAll();

    @Select("select curso.id, curso.titulo, curso.nivel, curso.numHoras, curso.activo, profesor.nombre, profesor.apellidos, curso.temario " +
            "from curso inner join profesor on curso.profesor_id = profesor.id where curso.activo=true order by curso.titulo")
    List<CursoDTO> findAllCursosActivos();

    @Insert("INSERT INTO curso(titulo, nivel, numHoras, activo, profesor_id) " +
            "VALUES (#{titulo}, #{nivel}, #{numHoras}, #{activo}, #{profesor_id})")
    void insert(Curso curso);

    @Insert("INSERT INTO curso(titulo, nivel, numHoras, activo, profesor_id, temario) " +
            "VALUES (#{titulo}, #{nivel}, #{numHoras}, #{activo}, #{profesor_id}, #{temario})")
    void insertConTemario(Curso curso);
}
