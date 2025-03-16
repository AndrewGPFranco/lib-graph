package com.gs.graph.adapters.input.dtos.anime;

import com.gs.graph.adapters.input.dtos.ApiResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

public record AnimeDTO(
        UUID id,
        @NotNull @NotBlank String title,
        @NotNull LocalDate creationDate,
        @NotNull @NotBlank String urlImage,
        LocalDate finalizationDate
) implements ApiResponse {

    @Override
    public boolean isSuccess() {
        return true;
    }

}
