package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.domain.repository.GameListRepository;
import com.devsuperior.dslist.domain.repository.GameRepository;
import com.devsuperior.dslist.domain.service.GameListService;
import com.devsuperior.dslist.domain.service.GameService;
import com.devsuperior.dslist.model.GameListModel;
import com.devsuperior.dslist.model.GameResumeModel;
import com.devsuperior.dslist.model.ReplacementModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/lists")
public class GameListController {

    private GameListService gameListService;
    private GameService gameService;

    private GameListRepository gameListRepository;
    private GameRepository gameRepository;

    @GetMapping
    public List<GameListModel> findAll() {
        return gameListRepository.findAll().stream()
                .map(GameListModel::new)
                .toList();
    }

    @GetMapping("/{listId}/games")
    public List<GameResumeModel> findByList(@PathVariable Long listId) {
        return gameRepository.searchByList(listId).stream()
                .map(GameResumeModel::new)
                .toList();
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
