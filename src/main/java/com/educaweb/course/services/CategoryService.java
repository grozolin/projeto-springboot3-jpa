package com.educaweb.course.services;

import com.educaweb.course.repositories.CategoryRepository;
import com.educaweb.course.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category FindById(long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
