package com.autentia.catalogocursos.springbootmybatis.controllers;

import com.autentia.catalogocursos.springbootmybatis.mappers.CursoMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/curso")
@CrossOrigin(origins = "http://localhost:4200")
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
}
