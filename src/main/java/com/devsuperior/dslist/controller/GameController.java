package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.domain.model.Game;
import com.devsuperior.dslist.domain.repository.GameRepository;
import com.devsuperior.dslist.domain.service.GameService;
import com.devsuperior.dslist.model.GameModel;
import com.devsuperior.dslist.model.GameResumeModel;
import com.devsuperior.dslist.model.input.GameInputModel;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/games")
public class GameController {

    private GameService gameService;
    private GameRepository gameRepository;

    @GetMapping
    public List<GameResumeModel> findAll() {
        return gameRepository.findAll().stream()
                .map(GameResumeModel::new)
                .toList();
    }

    @GetMapping("/{gameId}")
    public ResponseEntity<GameModel> findById(@PathVariable Long gameId) {
        return gameRepository.findById(gameId)
                .map(GameModel::new)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public GameModel salvar(@Valid @RequestBody GameInputModel gameInputModel) {
        Game gameSalvo = gameService.salvar(gameInputModel);

        return new GameModel(gameSalvo);
    }
}
