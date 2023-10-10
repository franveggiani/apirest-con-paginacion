package com.utn.apiresttutorial.repositories;

import com.utn.apiresttutorial.entities.Libro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibroRepository extends BaseRepository<Libro, Long> {

    @Query(value = "SELECT lib FROM Libro lib WHERE lib.titulo LIKE %:filtro%")
    List<Libro> search(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM libro WHERE libro.titulo LIKE %:filtro%", nativeQuery = true)
    List<Libro> searchNative(@Param("filtro") String filtro);

    //Pageable
    @Query(value = "SELECT lib FROM Libro lib WHERE lib.titulo LIKE %:filtro%")
    Page<Libro> searchPaged(@Param("filtro") String filtro, Pageable pageable);

}
