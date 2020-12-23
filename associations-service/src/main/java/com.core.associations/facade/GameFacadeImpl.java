package com.core.associations.facade;

import com.core.associations.domain.Game;
import com.core.associations.service.GameService;
import java.time.Instant;
import org.springframework.stereotype.Component;

@Component
public class GameFacadeImpl implements GameFacade {

  private final GameService gameService;

  public GameFacadeImpl(GameService gameService) {
    this.gameService = gameService;
  }

  @Override
  public Game createGame() {
    final Game newGame = new Game();
    newGame.setGameId("xyz-abc-iyt");
    newGame.setStartTime(Instant.now());
    return this.gameService.createGame(newGame);
  }

}
