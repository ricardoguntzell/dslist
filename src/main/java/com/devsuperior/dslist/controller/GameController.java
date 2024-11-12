package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.domain.service.GameService;
import com.devsuperior.dslist.model.GameModel;
import com.devsuperior.dslist.model.GameResumeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameResumeModel> findAll() {
        return gameService.findAll();
    }

    @GetMapping("/{gameId}")
    public ResponseEntity<GameModel> findById(@PathVariable Long gameId) {
        return gameService.findById(gameId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
