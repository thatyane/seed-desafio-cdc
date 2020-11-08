package io.github.thatyane.seeddesafiocdc.category;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryRepositoty categoryRepositoty;

    public CategoryController(CategoryRepositoty categoryRepositoty) {
        this.categoryRepositoty = categoryRepositoty;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Void> create(@Valid @RequestBody CategoryRequest categoryRequest) {
        categoryRepositoty.save(new Category(categoryRequest.getName()));
        return ResponseEntity.ok().build();
    }
}
