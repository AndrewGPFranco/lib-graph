package com.gs.graph.domain.graph;

import java.util.List;

public record GraphDTO(
        List<Node> nodes,
        List<Edge> edges
) {}
