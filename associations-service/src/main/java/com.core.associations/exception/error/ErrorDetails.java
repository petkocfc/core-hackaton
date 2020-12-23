package com.core.associations.exception.error;

import java.time.Instant;
import org.springframework.http.HttpStatus;

public class ErrorDetails {

  private Instant timestamp;
  private HttpStatus status;
  private String errorCode;
  private String message;

  public ErrorDetails() {
  }

  public ErrorDetails(Instant timestamp, HttpStatus status, String errorCode,
      String message) {
    this.timestamp = timestamp;
    this.status = status;
    this.errorCode = errorCode;
    this.message = message;
  }

  public Instant getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Instant timestamp) {
    this.timestamp = timestamp;
  }

  public HttpStatus getStatus() {
    return status;
  }

  public void setStatus(HttpStatus status) {
    this.status = status;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
