package com.gs.graph.repositories;

import com.gs.graph.AbstractContainerBaseTest;
import com.gs.graph.domain.entities.animes.Anime;
import com.gs.graph.ports.repositories.AnimeRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AnimeRepositoryTest extends AbstractContainerBaseTest {

    @Autowired
    private AnimeRepository repository;

    @BeforeEach
    void init() {
        Anime anime = new Anime("Naruto", now(), now().plusYears(5), "www.minhaimagem.png");
        repository.save(anime);
    }

    @AfterEach
    void destroy() {
        repository.deleteAll();
    }

    private LocalDate now() {
        return LocalDate.now();
    }

    @Test
    void testGetAllAnimes() {
        List<Anime> allAnimes = repository.findAll();
        assertEquals(1, allAnimes.size());
    }

    @Test
    void testFindById() {
        List<Anime> all = repository.findAll();
        Optional<Anime> firstFound = all.stream().findFirst();

        firstFound.ifPresent(anime -> assertEquals("Naruto", anime.getTitle()));
    }
}