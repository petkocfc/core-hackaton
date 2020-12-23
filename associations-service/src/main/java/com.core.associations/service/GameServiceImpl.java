package com.core.associations.service;

import com.core.associations.domain.Game;
import com.core.associations.repository.GameRepository;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService{

  private final GameRepository gameRepository;

  public GameServiceImpl(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  @Override
  public Game createGame(final Game newGame) {
    return this.gameRepository.save(newGame);
  }
}
