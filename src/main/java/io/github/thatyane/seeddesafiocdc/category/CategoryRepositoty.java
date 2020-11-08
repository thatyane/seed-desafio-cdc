package io.github.thatyane.seeddesafiocdc.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositoty extends JpaRepository<Category, Long> {
}
