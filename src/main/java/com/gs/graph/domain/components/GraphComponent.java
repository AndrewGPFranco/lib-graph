package com.gs.graph.domain.components;

import com.gs.graph.domain.entities.animes.Anime;
import com.gs.graph.domain.entities.personas.Persona;
import com.gs.graph.domain.enums.ArrowDirectionType;
import com.gs.graph.domain.enums.RelationshipType;
import com.gs.graph.domain.fixtures.AnimeFixture;
import com.gs.graph.domain.fixtures.PersonaFixture;
import com.gs.graph.domain.graph.Edge;
import com.gs.graph.domain.graph.GraphDTO;
import com.gs.graph.domain.graph.Node;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GraphComponent {

    public GraphDTO graphFactory() {
        List<Node> nodes = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();

        Anime anime1 = AnimeFixture.createAnimes().getFirst();
        anime1.setLabel(anime1.getTitle());

        Anime anime2 = AnimeFixture.createAnimes().get(1);
        anime2.setLabel(anime2.getTitle());

        Anime anime3 = AnimeFixture.createAnimes().get(2);
        anime3.setLabel(anime3.getTitle());

        Anime anime4 = AnimeFixture.createAnimes().get(3);
        anime4.setLabel(anime4.getTitle());

        Anime anime5 = AnimeFixture.createAnimes().get(4);
        anime5.setLabel(anime5.getTitle());

        Persona persona1 = PersonaFixture.createPersonas().get(0);
        Persona persona2 = PersonaFixture.createPersonas().get(1);
        Persona persona3 = PersonaFixture.createPersonas().get(2);
        Persona persona4 = PersonaFixture.createPersonas().get(3);
        Persona persona5 = PersonaFixture.createPersonas().get(4);

        Edge edge1 = Edge.builder()
                .from(persona1.getId())
                .to(anime1.getId())
                .label(RelationshipType.PERSONA_OF)
                .arrows(ArrowDirectionType.to)
                .build();

        Edge edge2 = Edge.builder()
                .from(persona2.getId())
                .to(anime1.getId())
                .label(RelationshipType.PERSONA_OF)
                .arrows(ArrowDirectionType.to)
                .build();

        Edge edge3 = Edge.builder()
                .from(persona3.getId())
                .to(anime1.getId())
                .label(RelationshipType.PERSONA_OF)
                .arrows(ArrowDirectionType.to)
                .build();

        Edge edge4 = Edge.builder()
                .from(persona4.getId())
                .to(anime1.getId())
                .label(RelationshipType.PERSONA_OF)
                .arrows(ArrowDirectionType.to)
                .build();

        Edge edge5 = Edge.builder()
                .from(persona5.getId())
                .to(anime1.getId())
                .label(RelationshipType.PERSONA_OF)
                .arrows(ArrowDirectionType.to)
                .build();

        nodes.add(anime1);

        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge4);
        edges.add(edge5);

        nodes.add(persona1);
        nodes.add(persona2);
        nodes.add(persona3);
        nodes.add(persona4);
        nodes.add(persona5);

        return new GraphDTO(nodes, edges);
    }

}
