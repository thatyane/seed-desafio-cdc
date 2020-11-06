package io.github.thatyane.seeddesafiocdc.domain.author;

import io.github.thatyane.seeddesafiocdc.infra.author.AuthorRepositoty;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    private AuthorRepositoty authorRepositoty;

    public AuthorController(AuthorRepositoty authorRepositoty) {
        this.authorRepositoty = authorRepositoty;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Void> create(@Valid @RequestBody AuthorRequest authorRequest) {
        authorRepositoty.save(authorRequest.toModel());
        return ResponseEntity.ok().build();
    }
}
