package com.gs.graph.ports.repositories;

import com.gs.graph.domain.entities.Anime;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AnimeRepository {

    Anime save(Anime anime);

    List<Anime> findAll();

    Optional<Anime> findById(UUID id);

    void deleteAll();

}
