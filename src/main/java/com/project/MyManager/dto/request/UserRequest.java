package com.project.MyManager.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequest {

    @NotBlank(message = "First name is required")
    @JsonProperty("first_name")
    @Size(max = 50, message = "First name must be less than or equal to 50 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @JsonProperty("last_name")
    @Size(max = 50, message = "Last name must be less than or equal to 50 characters")
    private String lastName;

    @NotBlank(message = "User code is required")
    @JsonProperty("user_code")
    @Size(max = 20, message = "User code must be less than or equal to 20 characters")
    private String userCode;

    @NotBlank(message = "User type is required")
    @JsonProperty("user_type")
    @Size(max = 20, message = "User type must be less than or equal to 20 characters")
    private String userType;

    @NotBlank(message = "Email is required")
    @JsonProperty("email")
    @Size(max = 100, message = "Email must be less than or equal to 100 characters")
    private String email;

    @NotBlank(message = "Password is required")
    @JsonProperty("password")
    @Size(min = 6, max = 100, message = "Password must be between 6 and 100 characters")
    private String password;

}
