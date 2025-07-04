package com.project.MyManager.service;

import org.springframework.stereotype.Service;

import com.project.MyManager.dto.request.CategoryRequest;
import com.project.MyManager.model.Category;

@Service
public interface CategoryService extends BaseService<Category, CategoryRequest, Long> {

    // Additional methods specific to CategoryService can be defined here if needed

}
