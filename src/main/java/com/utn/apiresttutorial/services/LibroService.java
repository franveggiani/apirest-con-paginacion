package com.utn.apiresttutorial.services;

import com.utn.apiresttutorial.entities.Libro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LibroService extends BaseService<Libro, Long> {

    List<Libro> search(String filtro) throws Exception;
    List<Libro> searchNative(String filtro) throws Exception;
    Page<Libro> searchPaged(String filtro, Pageable pageable) throws Exception;

}
