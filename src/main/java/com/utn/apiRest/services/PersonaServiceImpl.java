package com.utn.apiRest.services;

import com.utn.apiRest.entities.Persona;
import com.utn.apiRest.repositories.BaseRepository;
import com.utn.apiRest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepositoryRepository;
    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepositoryRepository) {
        super(baseRepository);
        this.personaRepositoryRepository = personaRepositoryRepository;
    }
}
