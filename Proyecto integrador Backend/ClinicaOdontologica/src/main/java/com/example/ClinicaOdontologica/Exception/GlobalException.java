package com.example.ClinicaOdontologica.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<String> tratamientoResourceNotFoundException(ResourceNotFoundException rnfe) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Mensaje: " + rnfe.getMessage());
    }

    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity<String> tratamientoBadRequest(BadRequestException bde) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Mensaje: " + bde.getMessage());
    }
}
