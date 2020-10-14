package com.autentia.catalogocursos.springbootmybatis.controllers;

import com.autentia.catalogocursos.springbootmybatis.ViewAdapters.CursoViewAdapter;
import com.autentia.catalogocursos.springbootmybatis.domain.Curso;
import com.autentia.catalogocursos.springbootmybatis.services.CursoService;
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
    private CursoService cursoService;

    /**
     * Obtener toda la lista de cursos existentes
     * @return Respuesta http con la lista de cursos
     */
    @GetMapping("/allCursos")
    public ResponseEntity<?> getAll(){
        log.info("Obteniendo cursos ...");
        List<Curso> listCursos = cursoService.getAll();
        return new ResponseEntity<>(listCursos.stream().map((c) -> new CursoViewAdapter(c)),HttpStatus.OK);
    }

    /**
     * Obtener toda la lista de cursos existentes
     * @return Respuesta http con la lista de cursos
     */
    @GetMapping("/allCursosActivos")
    public ResponseEntity<?> getAllActivos() {
        log.info("Obteniendo cursos activos ...");
        List<Curso> listCursos = cursoService.getAllCursosActivos();
        return new ResponseEntity<>(listCursos.stream().map((c) -> new CursoViewAdapter(c)),HttpStatus.OK);
    }

    /**
     * Añadir un curso
     * @return Respuesta http con el nuevo curso
     */
    @PostMapping("/addCurso")
    public ResponseEntity<?> addCurso(@RequestBody Curso curso) {
        log.info("Añadiendo curso..." + curso.toString());
        cursoService.insert(curso);
        return new ResponseEntity<>(curso, HttpStatus.OK);
    }

}
