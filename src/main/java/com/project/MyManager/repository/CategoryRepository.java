package com.project.MyManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.MyManager.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
