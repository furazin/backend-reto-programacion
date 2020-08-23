package com.autentia.catalogocursos.springbootmybatis.controllers;

import com.autentia.catalogocursos.springbootmybatis.dto.CursoDTO;
import com.autentia.catalogocursos.springbootmybatis.mappers.CursoMapper;
import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("api/curso")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CursoController {

    @Autowired
    private CursoMapper cursoMapper;

    /**
     * Obtener toda la lista de cursos existentes
     * @return Respuesta http con la lista de cursos
     */
    @GetMapping("/allCursos")
    public ResponseEntity<?> getAll(){
        log.info("Obteniendo cursos ...");
        List<CursoDTO> listaCursos = cursoMapper.findAll();
        return new ResponseEntity<>(listaCursos, HttpStatus.OK);
    }

    /**
     * Obtener toda la lista de cursos existentes
     * @return Respuesta http con la lista de cursos
     */
    @GetMapping("/allCursosActivos")
    public ResponseEntity<?> getAllActivos() {
        log.info("Obteniendo cursos activos ...");
        return new ResponseEntity<>(cursoMapper.findAllCursosActivos(), HttpStatus.OK);
    }

    /**
     * Añadir un curso
     * @return Respuesta http con el nuevo curso
     */
    @PostMapping("/addCurso")
    public ResponseEntity<?> addCurso(@RequestBody Curso curso) {
        log.info("Añadiendo curso..." + curso.toString());
        cursoMapper.insert(curso);
        return new ResponseEntity<>(curso, HttpStatus.OK);
    }

}
