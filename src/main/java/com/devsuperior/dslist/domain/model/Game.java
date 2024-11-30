package com.devsuperior.dslist.domain.model;

import com.devsuperior.dslist.model.input.GameInputModel;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcType;
import org.hibernate.dialect.PostgreSQLEnumJdbcType;
import org.springframework.beans.BeanUtils;

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

    @Enumerated(EnumType.STRING)
    @Column(name = "genre", columnDefinition = "ENUM('ACTION_AND_ADVENTURE', 'ELECTRONIC_ACTION_RPG','PLATFORM','SPORT')")
    @JdbcType(PostgreSQLEnumJdbcType.class)
    private Genre genre;

    @Enumerated(EnumType.STRING)
    @Column(name = "platforms", columnDefinition = "ENUM('MULTIPLE_PLATFORMS','PC','PLAY_STATION','SEGA_CD','SEGA_CD_AND_PC','SUPER_SNES','SUPER_SNES_AND_PC','XBOX')")
    @JdbcType(PostgreSQLEnumJdbcType.class)
    private Platforms platforms;

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
