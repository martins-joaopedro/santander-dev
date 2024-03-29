package me.joaopdmcr.sdw.adapters.in;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleDomainException(Exception error) {
        String message = "Ops, ocorreu um erro!";
        return ResponseEntity.internalServerError().body(new ApiError(message));
    }

    public record ApiError(String message) { }
}
