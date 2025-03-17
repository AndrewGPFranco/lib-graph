package com.gs.graph.domain.graph;

import com.gs.graph.domain.enums.ArrowDirectionType;
import com.gs.graph.domain.enums.RelationshipType;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Edge {

    private UUID to;
    private UUID from;
    private ArrowDirectionType arrows;
    private RelationshipType label;

    public Edge() {}

}