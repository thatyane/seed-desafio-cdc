package io.github.thatyane.seeddesafiocdc.author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepositoty extends JpaRepository<Author, Long> {
}
