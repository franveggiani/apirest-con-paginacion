package com.utn.apiresttutorial.services;

import com.utn.apiresttutorial.entities.Localidad;
import com.utn.apiresttutorial.repositories.BaseRepository;
import com.utn.apiresttutorial.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }

    public List<Localidad> search(String filtro) throws Exception{
        try {
            List<Localidad> localidades = localidadRepository.search(filtro);
            return localidades;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public List<Localidad> searchNative(String filtro) throws Exception{
        try {
            List<Localidad> localidades = localidadRepository.searchNative(filtro);
            return localidades;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
