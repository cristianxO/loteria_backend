package com.konex.loteria_backend.exception;

public class BilleteNoExistenteException extends RuntimeException {
    public BilleteNoExistenteException(String message) {
        super(message);
    }
}
