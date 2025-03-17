package com.gs.graph.domain.entities.personas;

import com.gs.graph.domain.entities.animes.Anime;
import com.gs.graph.domain.graph.GraphNode;
import com.gs.graph.domain.graph.Node;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Data
@Entity
@ToString
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Persona extends Node implements GraphNode {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, unique = true, nullable = false)
    private UUID id;

    @NotNull
    @NotBlank
    private String name;

    @ManyToOne
    @JoinColumn(name = "anime_id", nullable = false)
    private Anime anime;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String urlImage;

    public Persona(@NotNull @NotBlank String name, @NotNull Anime anime, String urlImage) {
        this.name = name;
        this.anime = anime;
        this.urlImage = urlImage;
    }


    public Persona(UUID uuid, String name, Anime anime, String url) {
        this.id = uuid;
        this.name = name;
        this.anime = anime;
        this.urlImage = url;
    }
}
