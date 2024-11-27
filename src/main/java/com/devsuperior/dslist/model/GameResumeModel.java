package com.devsuperior.dslist.model;

import com.devsuperior.dslist.domain.model.Game;
import com.devsuperior.dslist.domain.projection.GameResumeProjection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GameResumeModel {

    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private String shortDescription;

    public GameResumeModel(Game gameDomain) {
        BeanUtils.copyProperties(gameDomain, this);
    }

    public GameResumeModel(GameResumeProjection gameResumeProjection) {
        BeanUtils.copyProperties(gameResumeProjection, this);
        setYear(gameResumeProjection.getGameYear());
    }

}
