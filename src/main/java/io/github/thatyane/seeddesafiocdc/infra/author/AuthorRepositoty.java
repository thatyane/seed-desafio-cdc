package io.github.thatyane.seeddesafiocdc.infra.author;

import io.github.thatyane.seeddesafiocdc.domain.author.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepositoty extends JpaRepository<Author, Long> {
}
