package com.gs.graph.domain.entities.animes;

import com.gs.graph.domain.entities.personas.Persona;
import com.gs.graph.domain.graph.GraphNode;
import com.gs.graph.domain.graph.Node;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@ToString
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Anime extends Node implements GraphNode {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, unique = true, nullable = false)
    private UUID id;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String title;

    @OneToMany(mappedBy = "anime", cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Persona> personas;

    @NotNull
    private LocalDate creationDate;

    private LocalDate finalizationDate;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String urlImage;

    public Anime(@NotNull @NotBlank String title, @NotNull LocalDate creationDate, LocalDate finalizationDate,
                 String urlImage) {
        this.title = title;
        this.creationDate = creationDate;
        this.finalizationDate = finalizationDate;
        this.urlImage = urlImage;
    }

    public Anime(UUID id, String title, LocalDate creationDate, LocalDate finalizationDate, String urlImage) {
        this.id = id;
        this.title = title;
        this.creationDate = creationDate;
        this.finalizationDate = finalizationDate;
        this.urlImage = urlImage;
    }
}
