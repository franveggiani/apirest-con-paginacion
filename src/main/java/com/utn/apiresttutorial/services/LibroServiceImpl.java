package com.utn.apiresttutorial.services;

import com.utn.apiresttutorial.entities.Libro;
import com.utn.apiresttutorial.repositories.BaseRepository;
import com.utn.apiresttutorial.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {

    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
    @Override
    public List<Libro> search(String filtro) throws Exception {
        try {
            List<Libro> libros = libroRepository.search(filtro);
            return libros;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Libro> searchNative(String filtro) throws Exception {
        try{
            List<Libro> libros = libroRepository.searchNative(filtro);
            return libros;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Libro> searchPaged(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Libro> libros = libroRepository.searchPaged(filtro, pageable);
            return libros;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
