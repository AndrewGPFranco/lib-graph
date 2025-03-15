package com.gs.graph.mappers;

import com.gs.graph.dtos.persona.PersonaDTO;
import com.gs.graph.entities.Anime;
import com.gs.graph.entities.Persona;

public class PersonaMapper {

    public static PersonaDTO entityToDTO(Persona persona) {
        return new PersonaDTO(persona.getId(), persona.getName(), persona.getAnime().getId(), persona.getUrlImage());
    }

    public static Persona dtoToEntity(PersonaDTO persona, Anime anime) {
        return new Persona(persona.name(), anime, persona.urlImage());
    }

}
