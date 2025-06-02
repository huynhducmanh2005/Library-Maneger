package com.project.MyManager.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.MyManager.dto.request.CategoryRequest;
import com.project.MyManager.model.Category;
import com.project.MyManager.repository.CategoryRepository;
import com.project.MyManager.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void delete(long id) throws Exception {
        try {
            Category category = categoryRepository.findById(id)
                    .orElseThrow(() -> new Exception("Category not found with id: " + id));
            categoryRepository.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getById(long id) throws Exception {
        try {
            return categoryRepository.findById(id);

        } catch (Exception e) {
            throw new Exception("Error retrieving category with id: " + id);
        }
    }

    @Override
    public Category creat(CategoryRequest categoryRequest) throws Exception {
        try {

            Category category = new Category();
            category.setDescription(categoryRequest.getDescription());
            category.setName(categoryRequest.getName());
            category.setParentCategory(categoryRequest.getParentCategory());
            return categoryRepository.save(category);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Category update(long id, CategoryRequest categoryRequest) throws Exception {
        try {
            Category category = categoryRepository.findById(id).orElseThrow(() -> new Exception("Category not found "));
            category.setDescription(categoryRequest.getDescription());
            category.setName(categoryRequest.getName());
            category.setParentCategory(categoryRequest.getParentCategory());
            return categoryRepository.save(category);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
