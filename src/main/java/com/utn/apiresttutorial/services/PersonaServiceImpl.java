package com.utn.apiresttutorial.services;

import com.utn.apiresttutorial.entities.Persona;
import com.utn.apiresttutorial.repositories.BaseRepository;
import com.utn.apiresttutorial.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
    public List<Persona> search(String filtro) throws Exception {
        try {
            List<Persona> personas = personaRepository.search(filtro);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public List<Persona> searchNative(String filtro) throws Exception {
        try{
            List<Persona> personas = personaRepository.searchNative(filtro);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
