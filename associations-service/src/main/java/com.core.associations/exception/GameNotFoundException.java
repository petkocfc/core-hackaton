package com.core.associations.exception;

import com.core.associations.exception.error.ErrorCode;

public class GameNotFoundException extends AssociationsException{

  public GameNotFoundException() {
    super(ErrorCode.GAME_NOT_FOUND);
  }
}
