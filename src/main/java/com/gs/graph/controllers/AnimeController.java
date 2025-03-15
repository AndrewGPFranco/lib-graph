package com.gs.graph.controllers;

import com.gs.graph.dtos.ApiResponse;
import com.gs.graph.dtos.animes.AnimeDTO;
import com.gs.graph.dtos.errors.ErrorDTO;
import com.gs.graph.services.AnimeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/anime")
@RequiredArgsConstructor
public class AnimeController {

    private final AnimeService service;

    @PostMapping
    public ResponseEntity<ApiResponse> createAnime(@Valid @RequestBody AnimeDTO animeDTO) {
        try {
            AnimeDTO animeCreated = service.createAnime(animeDTO);
            return ResponseEntity.ok().body(animeCreated);
        } catch (Exception e) {
            ErrorDTO error = new ErrorDTO(e.getMessage(), HttpStatus.BAD_REQUEST);
            return ResponseEntity.badRequest().body(error);
        }
    }
}
