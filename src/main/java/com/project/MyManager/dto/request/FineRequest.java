package com.project.MyManager.dto.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.MyManager.model.Loan;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FineRequest {
    @NotBlank(message = "Status cannot be blank")
    @JsonProperty("status")
    @Size(max = 20, message = "Status must be less than or equal to 20 characters")
    private String status;

    @NotBlank(message = "Loan cannot be blank")
    @JsonProperty("loan_id")
    @Max(value = 10000000, message = "Loan ID must be a valid ID")
    @Min(value = 1, message = "Loan ID must be a valid ID")
    private long loanId;

    @NotBlank(message = "Amount cannot be blank")
    @JsonProperty("amount")
    @Size(max = 20, message = "Amount must be less than or equal to 20 characters")
    private String amount;

    @NotBlank(message = "Reason cannot be blank")
    @JsonProperty("reason")
    @Size(max = 255, message = "Reason must be less than or equal to 255 characters")
    private String reason;

    @NotNull(message = "Pain date cannot be null")
    @JsonProperty("pain_date")
    @Min(value = 0, message = "Pain date must be a valid date")
    @Max(value = 9999, message = "Pain date must be a valid date")
    private LocalDateTime painDate;
}
