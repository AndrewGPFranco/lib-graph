package com.gs.graph.domain.services;

import com.gs.graph.adapters.input.dtos.anime.AnimeDTO;
import com.gs.graph.domain.entities.animes.Anime;
import com.gs.graph.adapters.input.mappers.AnimeMapper;
import com.gs.graph.ports.repositories.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository repository;

    public AnimeDTO createAnime(AnimeDTO animeDto) {
        try {
            Anime anime = AnimeMapper.dtoToEntity(animeDto);
            Anime savedAnime = repository.save(anime);

            return AnimeMapper.entityToDTO(savedAnime);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<AnimeDTO> getAllAnimes() {
        List<Anime> allAnimes = repository.findAll();

        if(allAnimes.isEmpty()) return List.of();

        List<AnimeDTO> animeDTOList = new ArrayList<>(allAnimes.size());
        allAnimes.forEach(anime -> animeDTOList.add(AnimeMapper.entityToDTO(anime)));

        return animeDTOList;
    }

}
