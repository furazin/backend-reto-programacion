package com.autentia.catalogocursos.springbootmybatis;

import com.autentia.catalogocursos.springbootmybatis.mappers.CursoMapper;
import com.autentia.catalogocursos.springbootmybatis.models.Curso;
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

	@Override
	public void run(String...args) throws Exception {

		Curso curso1 = new Curso(new Long(1), "Introduccion a JSF2","Intermedio","25","activo","Roberto","Canales");
		Curso curso2 = new Curso(new Long(2), "Novedades en Java 8","Basico","10","activo","David","Gomez");

		cursoMapper.insert(curso1);
		cursoMapper.insert(curso2);

		log.info("Insertando Curso 1 -> {}", curso1.toString());
		log.info("Insertando Curso 2 -> {}", curso2.toString());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}

}
