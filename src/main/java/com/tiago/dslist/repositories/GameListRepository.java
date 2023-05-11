package com.tiago.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
