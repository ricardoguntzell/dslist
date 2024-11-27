package com.devsuperior.dslist.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_game_list")
public class GameList {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
