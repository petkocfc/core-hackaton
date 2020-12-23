package com.core.associations.web;

import com.core.associations.domain.Game;
import com.core.associations.facade.GameFacade;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {

  private GameFacade gameFacade;

  public GameController(GameFacade gameFacade) {
    this.gameFacade = gameFacade;
  }

  @PostMapping
  public HttpEntity<Game> createGame() {
    return ResponseEntity.ok().body(this.gameFacade.createGame());
  }

}
