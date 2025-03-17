package com.gs.graph.adapters.output;

import com.gs.graph.domain.entities.animes.Anime;
import com.gs.graph.ports.repositories.AnimeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaAnimeRepository extends AnimeRepository, JpaRepository<Anime, UUID> {

    void deleteAll();

}