package io.github.thatyane.seeddesafiocdc.infra.errors;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long timestamp;
    private Integer status;
    private String path;

    public StandardError(Long timestamp, Integer status, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.path = path;
    }
}
