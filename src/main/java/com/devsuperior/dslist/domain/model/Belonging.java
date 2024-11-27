package com.devsuperior.dslist.domain.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Objects;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_belonging")
public class Belonging {

    @EqualsAndHashCode.Include
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging(Game game, GameList gameList, Integer position) {
        this.id.setGame(game);
        this.id.setGameList(gameList);
        this.position = position;
    }
}
