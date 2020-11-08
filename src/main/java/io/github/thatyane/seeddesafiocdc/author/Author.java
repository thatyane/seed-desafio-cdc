package io.github.thatyane.seeddesafiocdc.author;

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
    @Column(nullable = false)
    private String name;

    @NotBlank
    @Email
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank
    @Length(max = 400)
    @Column(nullable = false)
    private String description;

    @NotNull
    @Column(nullable = false)
    private Instant instant;

    public Author(String name, String email, String description) {
        this.name = name;
        this.email = email;
        this.description = description;
        this.instant =  Instant.now();
    }
}
