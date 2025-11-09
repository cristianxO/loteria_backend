package com.konex.loteria_backend.exception;

public class ClienteNoExistenteException extends RuntimeException {
    public ClienteNoExistenteException(String message) {
        super(message);
    }
}
