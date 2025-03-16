package com.gs.graph.adapters.input.mappers;

import com.gs.graph.adapters.input.dtos.anime.AnimeDTO;
import com.gs.graph.domain.entities.Anime;

public class AnimeMapper {

    public static AnimeDTO entityToDTO(Anime anime) {
        return new AnimeDTO(anime.getId(), anime.getTitle(), anime.getCreationDate(), anime.getUrlImage(),
                anime.getFinalizationDate());
    }

    public static Anime dtoToEntity(AnimeDTO anime) {
        return new Anime(anime.title(), anime.creationDate(), anime.finalizationDate(), anime.urlImage());
    }

}
