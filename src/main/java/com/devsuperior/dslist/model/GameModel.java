package com.devsuperior.dslist.model;

import com.devsuperior.dslist.domain.model.Game;
import com.devsuperior.dslist.domain.model.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Setter
@Getter
@NoArgsConstructor
public class GameModel {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameModel(Game game) {
        BeanUtils.copyProperties(game, this);
        setGenre(game.getGenre().getName());
        setPlatforms(game.getPlatforms().getName());
    }
}
