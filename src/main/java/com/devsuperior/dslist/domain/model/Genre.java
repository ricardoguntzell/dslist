package com.devsuperior.dslist.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Genre {

    ELECTRONIC_ACTION_RPG("RPG Action Electronic"),

    ACTION_AND_ADVENTURE("Adventure and Action"),

    SPORT("Sport"),

    PLATFORM("Platform");

    private String name;
}
