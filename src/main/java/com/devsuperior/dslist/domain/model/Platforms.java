package com.devsuperior.dslist.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Platforms {

    PC("PC"),
    PLAY_STATION("Playstation"),
    XBOX("xBox"),
    SEGA_CD("Sega CD"),
    SUPER_SNES("Super Ness"),
    MULTIPLE_PLATFORMS("Multiplataforma"),
    SUPER_SNES_AND_PC("Super Ness and PC"),
    SEGA_CD_AND_PC("Sega CD and PC");

    private String name;
}
