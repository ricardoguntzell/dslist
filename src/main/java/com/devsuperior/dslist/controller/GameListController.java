package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.domain.service.GameListService;
import com.devsuperior.dslist.domain.service.GameService;
import com.devsuperior.dslist.model.GameListModel;
import com.devsuperior.dslist.model.GameResumeModel;
import com.devsuperior.dslist.model.ReplacementModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/lists")
public class GameListController {

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

    @PostMapping("/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementModel replacementModel) {

        gameListService.move(
                listId,
                replacementModel.getSourceIndex(),
                replacementModel.getDestinationIndex()
        );

    }

}
