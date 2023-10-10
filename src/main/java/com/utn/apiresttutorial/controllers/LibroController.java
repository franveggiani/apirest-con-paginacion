package com.utn.apiresttutorial.controllers;

import com.utn.apiresttutorial.entities.Libro;
import com.utn.apiresttutorial.services.LibroServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( path = "api/v1/libros")
@CrossOrigin("*")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {

    @GetMapping("/search")
    public ResponseEntity<?> search(String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/searchPaged")
    public ResponseEntity<?> searchPaged(String filtro, Pageable pageable){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.searchPaged(filtro, pageable));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
