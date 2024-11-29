package com.devsuperior.dslist.model.input;

import com.devsuperior.dslist.domain.model.Genre;
import com.devsuperior.dslist.domain.model.Platforms;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GameInputModel {

    @NotBlank
    private String title;

    @NotNull
    private Integer year;

    @NotNull
    private Genre genre;

    @NotNull
    private Platforms platforms;

    @NotNull
    private Double score;

    @NotBlank
    private String imgUrl;

    @NotBlank
    private String shortDescription;

    @NotBlank
    private String longDescription;
}
