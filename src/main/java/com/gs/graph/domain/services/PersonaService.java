package com.gs.graph.domain.services;

import com.gs.graph.adapters.input.dtos.persona.PersonaDTO;
import com.gs.graph.domain.entities.animes.Anime;
import com.gs.graph.domain.entities.personas.Persona;
import com.gs.graph.domain.exceptions.NotFoundException;
import com.gs.graph.adapters.input.mappers.PersonaMapper;
import com.gs.graph.ports.repositories.AnimeRepository;
import com.gs.graph.ports.repositories.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
            Persona savedPersona = repository.save(persona);

            return PersonaMapper.entityToDTO(savedPersona);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<PersonaDTO> getAllPersonas() {
        List<Persona> allAnimes = repository.findAll();

        if(allAnimes.isEmpty()) return List.of();

        List<PersonaDTO> personaDTOList = new ArrayList<>(allAnimes.size());
        allAnimes.forEach(persona -> personaDTOList.add(PersonaMapper.entityToDTO(persona)));

        return personaDTOList;
    }

    protected Anime getAnimeOrElseThrowException(UUID id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Nenhum mangá encontrado com o id " + id));
    }
}
