package com.gs.graph.repositories;

import com.gs.graph.AbstractContainerBaseTest;
import com.gs.graph.entities.Anime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimeRepositoryTest extends AbstractContainerBaseTest {

    @Autowired
    private AnimeRepository repository;

    @BeforeEach
    void init() {
        Anime anime = new Anime("Naruto", now(), null, "www.minhaimagem.png");
        repository.save(anime);
    }

    private LocalDate now() {
        return LocalDate.now();
    }

    @Test
    void testGetAllAnimes() {
        List<Anime> allAnimes = repository.findAll();
        assertEquals(1, allAnimes.size());
    }
}