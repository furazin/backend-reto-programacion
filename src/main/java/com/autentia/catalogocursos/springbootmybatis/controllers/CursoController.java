package com.autentia.catalogocursos.springbootmybatis.controllers;

import com.autentia.catalogocursos.springbootmybatis.mappers.CursoMapper;
import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("api/curso")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CursoController {

    private CursoMapper cursoMapper;

    public CursoController(CursoMapper cursoMapper) {
        this.cursoMapper = cursoMapper;
    }

    /**
     * Obtener toda la lista de cursos existentes
     * @return Respuesta http con la lista de cursos
     */
    @GetMapping("/allCursos")
    public ResponseEntity<?> getAll() {
        log.info("Obteniendo cursos ...");
        return new ResponseEntity<>(cursoMapper.findAll(), HttpStatus.OK);
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

    /**
     * Añadir un curso con temario
     * @return Respuesta http con el nuevo curso
     */
    @PostMapping("/addCursoConTemario")
    public ResponseEntity<?> addCursoConTemario(@RequestBody Curso curso) {
        log.info("Añadiendo curso con temario...");
        cursoMapper.insertConTemario(curso);
        return new ResponseEntity<>(curso, HttpStatus.OK);
    }
}
