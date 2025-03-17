package com.gs.graph.adapters.input.rest;

import com.gs.graph.domain.components.GraphComponent;
import com.gs.graph.domain.graph.GraphDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/graph")
@RequiredArgsConstructor
public class GraphController {

    private final GraphComponent graphComponent;

    @GetMapping
    public ResponseEntity<GraphDTO> getGraphAnimes() {
        GraphDTO graphDTO = graphComponent.graphFactory();
        return ResponseEntity.ok().body(graphDTO);
    }
}
