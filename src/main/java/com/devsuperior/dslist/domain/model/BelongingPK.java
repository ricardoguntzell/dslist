package com.devsuperior.dslist.domain.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Objects;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class BelongingPK {

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;
}
