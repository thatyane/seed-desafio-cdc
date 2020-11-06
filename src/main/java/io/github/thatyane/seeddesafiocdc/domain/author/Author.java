package io.github.thatyane.seeddesafiocdc.domain.author;

import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Length(max = 400)
    private String description;

    @NotNull
    private Instant instant;

    public Author(String name, String email, String description) {
        this.name = name;
        this.email = email;
        this.description = description;
        this.instant =  Instant.now();
    }
}
