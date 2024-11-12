package com.devsuperior.dslist.model;

import com.devsuperior.dslist.domain.model.Game;

public class GameModel {

    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private String shortDescription;

    public GameModel() {

    }

    public GameModel(Game gameDomain) {
        this.id = gameDomain.getId();
        this.title = gameDomain.getTitle();
        this.year = gameDomain.getYear();
        this.imgUrl = gameDomain.getImgUrl();
        this.shortDescription = gameDomain.getShortDescription();
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
