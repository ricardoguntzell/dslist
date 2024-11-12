package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.domain.service.GameListService;
import com.devsuperior.dslist.model.GameListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListModel> findAll() {
        return gameListService.findAll();
    }

}
