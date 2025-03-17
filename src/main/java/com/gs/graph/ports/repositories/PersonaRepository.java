package com.gs.graph.ports.repositories;

import com.gs.graph.domain.entities.personas.Persona;

import java.util.List;

public interface PersonaRepository {

    Persona save(Persona persona);
    List<Persona> findAll();

}
