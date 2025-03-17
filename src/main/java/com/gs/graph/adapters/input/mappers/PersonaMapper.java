package com.gs.graph.adapters.input.mappers;

import com.gs.graph.adapters.input.dtos.persona.PersonaDTO;
import com.gs.graph.domain.entities.animes.Anime;
import com.gs.graph.domain.entities.personas.Persona;

public class PersonaMapper {

    public static PersonaDTO entityToDTO(Persona persona) {
        return new PersonaDTO(persona.getId(), persona.getName(), persona.getAnime().getId(), persona.getUrlImage());
    }

    public static Persona dtoToEntity(PersonaDTO persona, Anime anime) {
        return new Persona(persona.name(), anime, persona.urlImage());
    }

}
