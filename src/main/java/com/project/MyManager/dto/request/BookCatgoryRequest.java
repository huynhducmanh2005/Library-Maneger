package com.project.MyManager.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BookCatgoryRequest {

    @NotNull(message = "Book ID cannot be null")
    @JsonProperty("book_id")
    @Min(value = 1, message = "Book ID must be a valid ID")
    @Max(value = 100, message = "Book ID must be a valid ID")
    private long bookId;

    @NotNull(message = "Category ID cannot be null")
    @JsonProperty("category_id")
    @Min(value = 1, message = "Category ID must be a valid ID")
    @Max(value = 100, message = "Category ID must be a valid ID")
    private long categoryId;
}
