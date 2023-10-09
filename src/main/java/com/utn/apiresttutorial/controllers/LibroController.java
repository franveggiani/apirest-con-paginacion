package com.utn.apiresttutorial.controllers;

import com.utn.apiresttutorial.entities.Libro;
import com.utn.apiresttutorial.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "api/v1/libros")
@CrossOrigin("*")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
