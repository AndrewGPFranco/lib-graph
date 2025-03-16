package com.gs.graph.adapters.input.rest;

import com.gs.graph.adapters.input.dtos.ApiResponse;
import com.gs.graph.adapters.input.dtos.error.ErrorDTO;
import com.gs.graph.adapters.input.dtos.persona.PersonaDTO;
import com.gs.graph.domain.services.PersonaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<PersonaDTO>> getAllAnimes() {
        List<PersonaDTO> allAnimes = service.getAllPersonas();

        return ResponseEntity.ok().body(allAnimes);
    }
}
