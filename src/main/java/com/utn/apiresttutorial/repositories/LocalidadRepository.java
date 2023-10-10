package com.utn.apiresttutorial.repositories;

import com.utn.apiresttutorial.entities.Localidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocalidadRepository extends BaseRepository<Localidad, Long> {

    //JPQL
    @Query(value = "SELECT l FROM Localidad l WHERE l.denominacion LIKE %:filtro%")
    List<Localidad> search (@Param("filtro") String filtro);

    //NATIVE
    @Query(value = "SELECT * FROM localidad WHERE localidad.denominacion LIKE %:filtro%", nativeQuery = true)
    List<Localidad> searchNative (@Param("filtro") String filtro);
}
