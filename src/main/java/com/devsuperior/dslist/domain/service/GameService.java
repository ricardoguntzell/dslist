package com.devsuperior.dslist.domain.service;

import com.devsuperior.dslist.domain.repository.GameRepository;
import com.devsuperior.dslist.model.GameModel;
import com.devsuperior.dslist.model.GameResumeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameResumeModel> findAll() {
        return gameRepository.findAll().stream()
                .map(GameResumeModel::new)
                .toList();
    }

    public List<GameResumeModel> findByList(Long listId) {
        return gameRepository.searchByList(listId).stream()
                .map(GameResumeModel::new)
                .toList();
    }

    public Optional<GameModel> findById(Long gameId) {
        return gameRepository.findById(gameId)
                .map(GameModel::new);
    }



}
