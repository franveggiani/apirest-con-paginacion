package com.utn.apiresttutorial.services;

import com.utn.apiresttutorial.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {

    List<Persona> search(String filtro) throws Exception;
    List<Persona> searchNative(String filtro) throws Exception;

}
