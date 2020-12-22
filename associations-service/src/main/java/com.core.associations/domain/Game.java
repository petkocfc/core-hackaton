package com.core.associations.domain;

import java.time.Instant;

public class Game {

  private String gameId;
  private Instant startTime;

  public Game() {
  }

  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public Instant getStartTime() {
    return startTime;
  }

  public void setStartTime(Instant startTime) {
    this.startTime = startTime;
  }
}
