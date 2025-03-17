package com.gs.graph.domain.fixtures;

import com.gs.graph.domain.entities.animes.Anime;
import com.gs.graph.domain.entities.personas.Persona;

import java.util.List;
import java.util.UUID;

public class PersonaFixture {

    public static List<Persona> createPersonas() {
        List<Anime> animes = AnimeFixture.createAnimes();

        return List.of(
                new Persona(UUID.randomUUID(), "Luffy", animes.get(0), "http://localhost:8080/luffy.png"),
                new Persona(UUID.randomUUID(), "Naruto", animes.get(1), "http://localhost:8080/naruto.png"),
                new Persona(UUID.randomUUID(), "Eren Yeager", animes.get(2), "http://localhost:8080/eren.png"),
                new Persona(UUID.randomUUID(), "Light Yagami", animes.get(3), "http://localhost:8080/light.png"),
                new Persona(UUID.randomUUID(), "Edward Elric", animes.get(4), "http://localhost:8080/edward.png"),
                new Persona(UUID.randomUUID(), "Tanjiro Kamado", animes.get(5), "http://localhost:8080/tanjiro.png"),
                new Persona(UUID.randomUUID(), "Yuji Itadori", animes.get(6), "http://localhost:8080/yuji.png"),
                new Persona(UUID.randomUUID(), "Izuku Midoriya", animes.get(7), "http://localhost:8080/deku.png"),
                new Persona(UUID.randomUUID(), "Gon Freecss", animes.get(8), "http://localhost:8080/gon.png"),
                new Persona(UUID.randomUUID(), "Goku", animes.get(9), "http://localhost:8080/goku.png")
        );
    }

}