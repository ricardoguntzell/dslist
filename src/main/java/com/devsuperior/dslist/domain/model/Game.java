package com.devsuperior.dslist.domain.model;

import com.devsuperior.dslist.model.input.GameInputModel;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_game")
public class Game {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "game_year")
    private Integer year;

    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game(GameInputModel gameInputModel) {
        BeanUtils.copyProperties(gameInputModel, this);
    }

}
