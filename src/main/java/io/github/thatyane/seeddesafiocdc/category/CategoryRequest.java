package io.github.thatyane.seeddesafiocdc.category;

import io.github.thatyane.seeddesafiocdc.infra.errors.UniqueValue;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class CategoryRequest {

    @NotBlank(message = "Name must not be null")
    @UniqueValue(domainClass = Category.class, fieldName = "name", message = "Name already created")
    private String name;
}
