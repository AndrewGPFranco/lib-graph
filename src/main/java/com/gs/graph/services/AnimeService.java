package com.gs.graph.services;

import com.gs.graph.dtos.animes.AnimeDTO;
import com.gs.graph.entities.Anime;
import com.gs.graph.mappers.AnimeMapper;
import com.gs.graph.repositories.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository repository;

    public AnimeDTO createAnime(AnimeDTO animeDto) {
        try {
            Anime anime = AnimeMapper.dtoToEntity(animeDto);
            repository.save(anime);

            return AnimeMapper.entityToDTO(anime);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
