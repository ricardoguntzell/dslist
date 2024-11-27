package com.devsuperior.dslist.domain.service;

import com.devsuperior.dslist.domain.projection.GameResumeProjection;
import com.devsuperior.dslist.domain.repository.GameListRepository;
import com.devsuperior.dslist.domain.repository.GameRepository;
import com.devsuperior.dslist.model.GameListModel;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GameListService {

    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    public List<GameListModel> findAll() {
        return gameListRepository.findAll().stream()
                .map(GameListModel::new)
                .toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {

        List<GameResumeProjection> list = gameRepository.searchByList(listId);

        GameResumeProjection gameUpdate = list.remove(sourceIndex);
        list.add(destinationIndex, gameUpdate);

        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }

    }

}
