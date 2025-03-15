package com.gs.graph.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.UUID;

@Data
@Entity
@Builder
@ToString
@EqualsAndHashCode
public class Persona {

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

}
