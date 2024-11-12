package com.devsuperior.dslist.model;

import com.devsuperior.dslist.domain.model.GameList;
import org.springframework.beans.BeanUtils;

public class GameListModel {

    private Long id;

    private String name;

    public GameListModel() {
    }

    public GameListModel(GameList gameListDomain) {
        BeanUtils.copyProperties(gameListDomain, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
