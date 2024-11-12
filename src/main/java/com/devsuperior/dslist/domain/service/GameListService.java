package com.devsuperior.dslist.domain.service;

import com.devsuperior.dslist.domain.repository.GameListRepository;
import com.devsuperior.dslist.model.GameListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListModel> findAll() {
        return gameListRepository.findAll().stream()
                .map(GameListModel::new)
                .toList();
    }

}
