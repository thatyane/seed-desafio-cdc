package io.github.thatyane.seeddesafiocdc.author;

import lombok.Getter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import io.github.thatyane.seeddesafiocdc.infra.errors.UniqueValue;

@Getter
public class AuthorRequest {

    @NotBlank(message = "Name must not be null")
    private String name;

    @Email(message = "Invalid e-mail address")
    @NotBlank(message = "E-mail must not be null")
    @UniqueValue(domainClass = Author.class, fieldName = "email", message = "E-mail address already created")
    private String email;

    @NotBlank(message = "Description must not be null")
    @Length(min = 1, max = 400, message = "Description must be at most 400 characters")
    private String description;

    public Author toModel() {
        return new Author(this.name, this.email, this.description);
    }
}
