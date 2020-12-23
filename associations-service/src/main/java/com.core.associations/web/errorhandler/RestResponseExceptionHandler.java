package com.core.associations.web.errorhandler;

import com.core.associations.exception.AssociationsException;
import com.core.associations.exception.error.ErrorDetails;
import java.time.Instant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(AssociationsException.class)
  public ResponseEntity<ErrorDetails> associationsServiceException(AssociationsException exception) {
    final ErrorDetails errorDetails = new ErrorDetails(Instant.now(), exception.getHttpStatus(), exception.getErrorCode(), exception.getLocalizedMessage());
    return new ResponseEntity<>(errorDetails, errorDetails.getStatus());
  }

}
