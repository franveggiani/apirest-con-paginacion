package com.utn.apiresttutorial.services;

import com.utn.apiresttutorial.entities.Localidad;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long> {

    List<Localidad> searchNative(String filtro) throws Exception;

    List<Localidad> search(String filtro) throws Exception;

}
