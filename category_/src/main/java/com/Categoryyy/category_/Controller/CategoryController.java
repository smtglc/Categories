package com.Categoryyy.category_.Controller;

import com.Categoryyy.category_.Entity.Category;
import com.Categoryyy.category_.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;


    @GetMapping
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Category> createDoctor(@RequestBody Category category) {
        Category _category;
        _category = categoryRepository.save(category);

        return new ResponseEntity<>(_category, HttpStatus.CREATED);
    }

}
