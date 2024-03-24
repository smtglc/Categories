package com.Categoryyy.category_.Controller;

import com.Categoryyy.category_.Entity.Category;
import com.Categoryyy.category_.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
