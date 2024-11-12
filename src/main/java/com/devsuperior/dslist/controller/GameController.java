package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.domain.service.GameService;
import com.devsuperior.dslist.model.GameModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameModel> listarTodos() {
        return gameService.listarTodos();
    }
}
