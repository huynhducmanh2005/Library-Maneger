package com.project.MyManager.dto.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ReservationRequest {

    @NotNull(message = "User ID cannot be null")
    @JsonProperty("user_id")
    @Min(value = 1, message = "User ID must be a valid ID")
    @Max(value = 10000000, message = "User ID must be a valid ID")
    private long userId;

    @NotNull(message = "Book ID cannot be null")
    @JsonProperty("book_id")
    @Min(value = 1, message = "Book ID must be a valid ID")
    @Max(value = 100, message = "Book ID must be a valid ID")
    private long bookId;

    @NotBlank(message = "Queue position cannot be blank")
    @JsonProperty("queue_position")
    @Size(max = 10, message = "Queue position must be less than or equal to 10 characters")
    private String queuePosition;

    @NotBlank(message = "Status cannot be blank")
    @JsonProperty("status")
    @Size(max = 20, message = "Status must be less than or equal to 20 characters")
    private String status;

    @NotNull(message = "Reservation date cannot be null")
    @JsonProperty("reservation_date")
    private LocalDateTime reservationDate;

    @NotNull(message = "Expiration date cannot be null")
    @JsonProperty("expiration_date")
    private LocalDateTime expirationDate;

}
