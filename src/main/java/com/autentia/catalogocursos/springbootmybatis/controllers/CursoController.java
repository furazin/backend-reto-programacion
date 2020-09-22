package com.autentia.catalogocursos.springbootmybatis.controllers;

import com.autentia.catalogocursos.springbootmybatis.models.Curso;
import com.autentia.catalogocursos.springbootmybatis.services.CursoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        log.info("Obteniendo cursos ...");;
        return new ResponseEntity<>(cursoService.getAll(), HttpStatus.OK);
    }

    /**
     * Obtener toda la lista de cursos existentes
     * @return Respuesta http con la lista de cursos
     */
    @GetMapping("/allCursosActivos")
    public ResponseEntity<?> getAllActivos() {
        log.info("Obteniendo cursos activos ...");
        return new ResponseEntity<>(cursoService.getAllCursosActivos(), HttpStatus.OK);
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
