package com.gs.graph.mappers;

import com.gs.graph.dtos.animes.AnimeDTO;
import com.gs.graph.entities.Anime;

public class AnimeMapper {

    public static AnimeDTO entityToDTO(Anime anime) {
        return new AnimeDTO(anime.getId(), anime.getTitle(), anime.getCreationDate(), anime.getFinalizationDate());
    }

    public static Anime dtoToEntity(AnimeDTO anime) {
        return new Anime(anime.title(), anime.creationDate(), anime.finalizationDate());
    }

}
