package com.konex.loteria_backend.exception;

public class SorteoNoExistenteException extends RuntimeException {
    public SorteoNoExistenteException(String message) {
        super(message);
    }
}
