package com.devsuperior.dslist.domain.repository;

import com.devsuperior.dslist.domain.model.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
