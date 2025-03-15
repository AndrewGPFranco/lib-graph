package com.gs.graph.entities;

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
@EqualsAndHashCode
public class Anime {

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

    public Anime(@NotNull @NotBlank String title, @NotNull LocalDate creationDate, LocalDate finalizationDate) {
        this.title = title;
        this.creationDate = creationDate;
        this.finalizationDate = finalizationDate;
    }
}
