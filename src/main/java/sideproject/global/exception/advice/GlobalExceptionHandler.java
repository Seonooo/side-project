package sideproject.global.exception.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sideproject.global.exception.ErrorMessage;
import sideproject.global.exception.user.DuplicateEmailException;
import sideproject.global.exception.user.DuplicateIdException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicateIdException.class)
    public ResponseEntity<Object> duplicateIdExceptionHandler(DuplicateIdException e) {
        log.info("DuplicateIdException occurred. request id : {}", e.getUserId());
        return new ResponseEntity<>(new ErrorMessage(e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DuplicateEmailException.class)
    public ResponseEntity<Object> duplicateIdExceptionHandler(DuplicateEmailException e) {
        log.info("DuplicateIdException occurred. request email : {}", e.getEmail());
        return new ResponseEntity<>(new ErrorMessage(e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
