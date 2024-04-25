package com.prueba.back_front.domain.exception;

public class AdminIdNotFoundException extends RuntimeException {

    public AdminIdNotFoundException(String message){
        super(message);
    }
}
