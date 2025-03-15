package com.gs.graph.dtos.animes;

import com.gs.graph.dtos.ApiResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

public record AnimeDTO(
        UUID id,
        @NotNull @NotBlank String title,
        @NotNull LocalDate creationDate,
        LocalDate finalizationDate
) implements ApiResponse {

    @Override
    public boolean isSuccess() {
        return true;
    }

}
