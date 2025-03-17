package com.gs.graph.adapters.output;

import com.gs.graph.domain.entities.personas.Persona;
import com.gs.graph.ports.repositories.PersonaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaPersonaRepository extends PersonaRepository, JpaRepository<Persona, UUID> {}