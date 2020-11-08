package io.github.thatyane.seeddesafiocdc.infra.errors;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class FieldMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fieldName;
    private String message;

    public FieldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }
}
