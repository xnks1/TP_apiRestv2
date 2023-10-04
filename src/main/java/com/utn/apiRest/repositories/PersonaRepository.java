package com.utn.apiRest.repositories;


import com.utn.apiRest.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
