package io.gitbub.juliannapeace.clientes.rest.exception;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class Errors {

    @Getter
    public List<String> errors;

    public Errors(List<String> errors){
        this.errors = errors;
    }

    public Errors(String message){
        this.errors = Arrays.asList(message);
    }

}
