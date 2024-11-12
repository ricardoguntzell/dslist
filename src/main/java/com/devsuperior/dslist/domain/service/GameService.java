package com.devsuperior.dslist.domain.service;

import com.devsuperior.dslist.domain.repository.GameRepository;
import com.devsuperior.dslist.model.GameModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameModel> listarTodos() {
        return gameRepository.findAll().stream()
                .map(GameModel::new)
                .toList();
    }

}
