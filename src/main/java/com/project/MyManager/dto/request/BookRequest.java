package com.project.MyManager.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookRequest {

    @NotBlank(message = "Title is required")
    @JsonProperty("title")
    @Size(min = 1, max = 100, message = "Title must be between 1 and 100 characters")
    private String title;

    @NotBlank(message = "ISBN is required")
    @JsonProperty("isbn")
    @Size(min = 10, max = 13, message = "ISBN must be between 10 and 13 characters")
    private String isbn;

    @NotBlank(message = "Author is required")
    @JsonProperty("author")
    @Size(min = 1, max = 50, message = "Author name must be between 1 and 50 characters")
    private String author;

    @NotBlank(message = "Publisher is required")
    @JsonProperty("publisher")
    @Size(min = 1, max = 50, message = "Publisher name must be between 1 and 50 characters")
    private String publisher;

    @NotBlank(message = "Publish year is required")
    @JsonProperty("publish_year")
    @Size(min = 4, max = 4, message = "Publish year must be exactly 4 characters")
    private String publishYear;

    @NotNull(message = "Total copies is required")
    @JsonProperty("total_copies")
    @Min(value = 1, message = "Total copies must be at least 1")
    @Max(value = 10000000, message = "Total copies cannot exceed 10000000")
    private double totalCopies;

    @NotBlank(message = "Available copies is required")
    @JsonProperty("available_copies")
    @Size(min = 1, max = 10, message = "Available copies must be between 1 and 10 characters")
    private String availableCopies;

    @NotNull(message = "Shelf location is required")
    @JsonProperty("shelf_location")
    @Min(value = 1, message = "Shelf location must be at least 1")
    @Max(value = 1000000000, message = "Shelf location cannot exceed 1000000000")
    private long shelfLocation;

    @NotNull(message = "Price is required")
    @JsonProperty("price")
    @Min(value = 0, message = "Price must be at least 0")
    @Max(value = 1000000, message = "Price cannot exceed 1000000")
    private double price;
}
