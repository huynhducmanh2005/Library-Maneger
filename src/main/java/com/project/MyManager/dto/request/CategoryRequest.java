package com.project.MyManager.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.MyManager.model.Category;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequest {
    @NotBlank(message = "Name cannot be blank")
    @JsonProperty("name")
    @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters")
    private String name;

    @NotBlank(message = "Description cannot be blank")
    @JsonProperty("description")
    @Size(min = 1, max = 255, message = "Description must be between 1 and 255 characters")
    private String description;

    @JsonProperty("parent_category_id")
    @Size(min = 1, max = 20, message = "Parent category ID must be between 1 and 20 characters")
    @NotBlank(message = "Parent category ID cannot be blank")
    private Category parentCategory;
}
