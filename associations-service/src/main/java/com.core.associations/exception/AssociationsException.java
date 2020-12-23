package com.core.associations.exception;

import com.core.associations.exception.error.ErrorCode;
import org.springframework.http.HttpStatus;

public abstract class AssociationsException extends RuntimeException{

  private String errorCode;
  private HttpStatus httpStatus;

  public AssociationsException(final String message, final String errorCode, final HttpStatus httpStatus) {
    super(message);
    this.errorCode = errorCode;
    this.httpStatus = httpStatus;
  }

  public AssociationsException(final ErrorCode errorCode) {
    super(errorCode.getErrorMessage());
    this.errorCode = errorCode.getErrorCode();
    this.httpStatus = errorCode.getHttpStatus();
  }

  public String getErrorCode() {
    return errorCode;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }
}
