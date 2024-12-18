package com.devsuperior.dslist.domain.service;

import com.devsuperior.dslist.domain.model.Game;
import com.devsuperior.dslist.domain.repository.GameRepository;
import com.devsuperior.dslist.model.GameModel;
import com.devsuperior.dslist.model.GameResumeModel;
import com.devsuperior.dslist.model.input.GameInputModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class GameService {

    private GameRepository gameRepository;

    public Game salvar(GameInputModel gameInputModel) {
        Game newGame = new Game(gameInputModel);

        return gameRepository.save(newGame);
    }
}
