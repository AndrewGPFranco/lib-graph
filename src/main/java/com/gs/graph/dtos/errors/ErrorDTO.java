package com.gs.graph.dtos.errors;

import com.gs.graph.dtos.ApiResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;

/**
 * Utilizado para enviar respostas com erros para o cliente.
 * @param message explicando o erro.
 * @param statusCode {@link HttpStatus}
 */
public record ErrorDTO(
        @NotNull @NotBlank String message,
        @NotNull HttpStatus statusCode
) implements ApiResponse {

    @Override
    public boolean isSuccess() {
        return false;
    }

}
