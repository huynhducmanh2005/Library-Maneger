package com.project.MyManager.dto.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.MyManager.model.Book;
import com.project.MyManager.model.User;

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
public class LoanRequest {

    @JsonProperty("user_id")
    @NotNull(message = "User ID cannot be null")
    @Min(value = 1, message = "User ID must be a valid ID")
    @Max(value = 100, message = "User ID must be a valid ID")
    private long userId;

    @JsonProperty("book_id")
    @NotNull(message = "Book ID cannot be null")
    @Min(value = 1, message = "Book ID must be a valid ID")
    @Max(value = 100, message = "Book ID must be a valid ID")
    private long bookId;

    @JsonProperty("loan_date")
    @NotNull(message = "Loan date cannot be null")
    private LocalDate loanDate;

    @JsonProperty("due_date")
    @NotNull(message = "Due date cannot be null")
    private LocalDate dueDate;

    @JsonProperty("status")
    @NotBlank(message = "Status cannot be blank")
    @Size(max = 20, message = "Status must be less than or equal to 20 characters")
    private String status;

    @NotNull(message = "Renewal count cannot be null")
    @JsonProperty("renewal_count")
    @Min(value = 0, message = "Renewal count cannot be negative")
    @Max(value = 10, message = "Renewal count cannot exceed 10")
    private long renewalCount;

    @JsonProperty("is_extended")
    @NotNull
    private boolean isExtended;
}
