package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.domain.service.GameListService;
import com.devsuperior.dslist.domain.service.GameService;
import com.devsuperior.dslist.model.GameListModel;
import com.devsuperior.dslist.model.GameResumeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListModel> findAll() {
        return gameListService.findAll();
    }

    @GetMapping("/{listId}/games")
    public List<GameResumeModel> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
