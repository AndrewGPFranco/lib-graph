package com.gs.graph.dtos;

/**
 * Ajuda a tipar o {@link org.springframework.http.ResponseEntity} nos controllers.
 */
public interface ApiResponse {
    boolean isSuccess();
}