package com.core.associations.exception.error;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

  GAME_NOT_FOUND("GAME_NOT_FOUND", "Game does not exist", HttpStatus.NOT_FOUND);

  private final String errorCode;
  private final String errorMessage;
  private final HttpStatus httpStatus;

  ErrorCode(String errorCode, String errorMessage,
      HttpStatus httpStatus) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
    this.httpStatus = httpStatus;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }
}
