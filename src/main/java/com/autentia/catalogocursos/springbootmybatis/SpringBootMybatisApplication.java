package com.autentia.catalogocursos.springbootmybatis;

import com.autentia.catalogocursos.springbootmybatis.mappers.CursoMapper;
import com.autentia.catalogocursos.springbootmybatis.mappers.ProfesorMapper;
import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import com.autentia.catalogocursos.springbootmybatis.models.Profesor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Curso.class)
@MapperScan("com.autentia.catalogocursos.springbootmybatis.mappers")
@Slf4j
@SpringBootApplication
public class SpringBootMybatisApplication implements CommandLineRunner {

	@Autowired
	private CursoMapper cursoMapper;

	@Autowired
	private ProfesorMapper profesorMapper;

	@Override
	public void run(String...args) throws Exception {

		Profesor profesor1 = new Profesor(new Long(1), "Roberto", "Canales");
		Profesor profesor2 = new Profesor(new Long(2), "David", "Gómez");
		Profesor profesor3 = new Profesor(new Long(3), "Alberto", "Moratilla");
		Profesor profesor4 = new Profesor(new Long(4), "Rubén", "Aguilera");

		profesorMapper.insert(profesor1);
		profesorMapper.insert(profesor2);
		profesorMapper.insert(profesor3);
		profesorMapper.insert(profesor4);

		log.info("Insertando Profesor 1 -> {}", profesor1.toString());
		log.info("Insertando Profesor 2 -> {}", profesor2.toString());
		log.info("Insertando Profesor 3 -> {}", profesor3.toString());
		log.info("Insertando Profesor 4 -> {}", profesor4.toString());

		Curso curso1 = new Curso(new Long(1), "Introduccion a JSF2","Intermedio","25","activo",new Long(1));
		Curso curso2 = new Curso(new Long(2), "Novedades en Java 8","Basico","10","activo",new Long(2));
		Curso curso3 = new Curso(new Long(3), "Introduccion a JSF2","Intermedio","25","activo",new Long(1));
		Curso curso4 = new Curso(new Long(4), "Introduccion a JSF2","Intermedio","25","activo",new Long(2));
		Curso curso5 = new Curso(new Long(5), "Introduccion a JSF2","Intermedio","25","activo",new Long(1));
		Curso curso6 = new Curso(new Long(6), "Novedades en Java 8","Basico","10","activo",new Long(2));
		Curso curso7 = new Curso(new Long(7), "Introduccion a JSF2","Intermedio","25","activo",new Long(1));
		Curso curso8 = new Curso(new Long(8), "Novedades en Java 8","Basico","10","activo",new Long(2));

		cursoMapper.insert(curso1);
		cursoMapper.insert(curso2);
		cursoMapper.insert(curso3);
		cursoMapper.insert(curso4);
		cursoMapper.insert(curso5);
		cursoMapper.insert(curso6);
		cursoMapper.insert(curso7);
		cursoMapper.insert(curso8);

		log.info("Insertando Curso 1 -> {}", curso1.toString());
		log.info("Insertando Curso 2 -> {}", curso2.toString());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}

}
