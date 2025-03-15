package com.gs.graph.services;

import com.gs.graph.dtos.persona.PersonaDTO;
import com.gs.graph.entities.Anime;
import com.gs.graph.entities.Persona;
import com.gs.graph.exceptions.NotFoundException;
import com.gs.graph.mappers.PersonaMapper;
import com.gs.graph.repositories.AnimeRepository;
import com.gs.graph.repositories.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonaService {

    private final PersonaRepository repository;
    private final AnimeRepository animeRepository;

    public PersonaDTO createPersona(PersonaDTO personaDTO) {
        try {
            Anime anime = getAnimeOrElseThrowException(personaDTO.animeId());
            Persona persona = PersonaMapper.dtoToEntity(personaDTO, anime);
            repository.save(persona);

            return PersonaMapper.entityToDTO(persona);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    protected Anime getAnimeOrElseThrowException(UUID id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Nenhum mangá encontrado com o id " + id));
    }
}
