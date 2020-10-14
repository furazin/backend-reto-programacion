package com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers;

import com.autentia.catalogocursos.springbootmybatis.repository.impl.mappers.dto.CursoDTO;
import com.autentia.catalogocursos.springbootmybatis.domain.Curso;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CursoMapper {

    @Select("select curso.id, curso.titulo, curso.nivel, curso.numHoras, curso.activo, profesor.nombre, profesor.apellidos, curso.temario " +
            "from curso inner join profesor on curso.profesor_id = profesor.id")
    List<CursoDTO> findAll();

    @Select("select curso.id, curso.titulo, curso.nivel, curso.numHoras, curso.activo, curso.profesor_id, profesor.nombre as nombreProfesor, profesor.apellidos as apellidosProfesor, curso.temario " +
            "from curso inner join profesor on curso.profesor_id = profesor.id where curso.activo=true order by curso.titulo")
    @ConstructorArgs(value={
            @Arg(column="id",javaType = Long.class),
            @Arg(column="titulo",javaType = String.class),
            @Arg(column="nivel",javaType = String.class),
            @Arg(column="numHoras",javaType = String.class),
            @Arg(column="activo",javaType = Boolean.class),
            @Arg(column="profesor_id",javaType = Long.class),
            @Arg(column="nombreProfesor",javaType = String.class),
            @Arg(column="apellidosProfesor",javaType = String.class),
            @Arg(column="temario",javaType = String.class),

    })
    List<CursoDTO> findAllCursosActivos();

    @Insert("INSERT INTO curso(titulo, nivel, numHoras, activo, profesor_id, temario) " +
            "VALUES (#{titulo}, #{nivel}, #{numHoras}, #{activo}, #{profesor.id}, #{temario})")
    void insert(Curso curso);
}
