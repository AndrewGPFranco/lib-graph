package com.gs.graph.dtos.persona;

import com.gs.graph.dtos.ApiResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record PersonaDTO(
        UUID id,
        @NotNull @NotBlank String name,
        @NotNull UUID animeId,
        @NotNull @NotBlank String urlImage
) implements ApiResponse {

    @Override
    public boolean isSuccess() {
        return true;
    }

}