package com.devsuperior.dslist.model;

import com.devsuperior.dslist.domain.model.Game;
import com.devsuperior.dslist.domain.projection.GameResumeProjection;

public class GameResumeModel {

    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private String shortDescription;

    public GameResumeModel() {

    }

    public GameResumeModel(Game gameDomain) {
        this.id = gameDomain.getId();
        this.title = gameDomain.getTitle();
        this.year = gameDomain.getYear();
        this.imgUrl = gameDomain.getImgUrl();
        this.shortDescription = gameDomain.getShortDescription();
    }

    public GameResumeModel(GameResumeProjection gameResumeProjection) {
        this.id = gameResumeProjection.getId();
        this.title = gameResumeProjection.getTitle();
        this.year = gameResumeProjection.getGameYear();
        this.imgUrl = gameResumeProjection.getImgUrl();
        this.shortDescription = gameResumeProjection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
