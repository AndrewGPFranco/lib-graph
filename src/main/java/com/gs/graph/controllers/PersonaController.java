package com.gs.graph.controllers;

import com.gs.graph.dtos.ApiResponse;
import com.gs.graph.dtos.errors.ErrorDTO;
import com.gs.graph.dtos.persona.PersonaDTO;
import com.gs.graph.services.PersonaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/persona")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService service;

    @PostMapping
    public ResponseEntity<ApiResponse> createPersona(@Valid @RequestBody PersonaDTO personaDTO) {
        try {
            PersonaDTO personaCreated = service.createPersona(personaDTO);
            return ResponseEntity.ok().body(personaCreated);
        } catch (Exception e) {
            ErrorDTO error = new ErrorDTO(e.getMessage(), HttpStatus.BAD_REQUEST);
            return ResponseEntity.badRequest().body(error);
        }
    }
}
