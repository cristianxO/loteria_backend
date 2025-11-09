package com.konex.loteria_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ClienteExistenteException.class)
    public ResponseEntity<String> handleClienteExistenteException(ClienteExistenteException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    @ExceptionHandler(BilleteVendidoException.class)
    public ResponseEntity<String> handleBilleteVendidoException(BilleteVendidoException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    @ExceptionHandler(ClienteNoExistenteException.class)
    public ResponseEntity<String> handleClienteNoExistenteException(ClienteNoExistenteException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(BilleteNoExistenteException.class)
    public ResponseEntity<String> handleBilleteNoExistenteException(BilleteNoExistenteException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(SorteoNoExistenteException.class)
    public ResponseEntity<String> handleSorteoNoExistenteException(SorteoNoExistenteException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
