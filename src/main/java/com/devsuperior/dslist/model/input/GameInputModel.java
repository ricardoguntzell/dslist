package com.devsuperior.dslist.model.input;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GameInputModel {
    private String title;

    private Integer year;

    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    private String shortDescription;

    private String longDescription;
}
