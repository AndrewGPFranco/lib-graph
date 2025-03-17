package com.gs.graph.domain.fixtures;

import com.gs.graph.domain.entities.animes.Anime;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class AnimeFixture {

    public static List<Anime> createAnimes() {
        return List.of(
                new Anime(UUID.randomUUID(), "One Piece", LocalDate.now(), LocalDate.now().plusDays(2), "http://localhost:8080/onepiece.png"),
                new Anime(UUID.randomUUID(), "Naruto", LocalDate.now().minusDays(10), LocalDate.now().plusDays(5), "http://localhost:8080/naruto.png"),
                new Anime(UUID.randomUUID(), "Attack on Titan", LocalDate.now().minusDays(20), LocalDate.now().plusDays(7), "http://localhost:8080/aot.png"),
                new Anime(UUID.randomUUID(), "Death Note", LocalDate.now().minusDays(30), LocalDate.now().plusDays(10), "http://localhost:8080/deathnote.png"),
                new Anime(UUID.randomUUID(), "Fullmetal Alchemist", LocalDate.now().minusDays(15), LocalDate.now().plusDays(3), "http://localhost:8080/fma.png"),
                new Anime(UUID.randomUUID(), "Demon Slayer", LocalDate.now().minusDays(5), LocalDate.now().plusDays(1), "http://localhost:8080/demonslayer.png"),
                new Anime(UUID.randomUUID(), "Jujutsu Kaisen", LocalDate.now(), LocalDate.now().plusDays(4), "http://localhost:8080/jujutsukaisen.png"),
                new Anime(UUID.randomUUID(), "My Hero Academia", LocalDate.now().minusDays(25), LocalDate.now().plusDays(8), "http://localhost:8080/mha.png"),
                new Anime(UUID.randomUUID(), "Hunter x Hunter", LocalDate.now().minusDays(40), LocalDate.now().plusDays(12), "http://localhost:8080/hxh.png"),
                new Anime(UUID.randomUUID(), "Dragon Ball Z", LocalDate.now().minusDays(50), LocalDate.now().plusDays(15), "http://localhost:8080/dbz.png")
        );
    }

}
