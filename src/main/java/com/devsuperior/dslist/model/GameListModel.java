package com.devsuperior.dslist.model;

import com.devsuperior.dslist.domain.model.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Setter
@Getter
@NoArgsConstructor
public class GameListModel {

    private Long id;

    private String name;

    public GameListModel(GameList gameListDomain) {
        BeanUtils.copyProperties(gameListDomain, this);
    }
}
