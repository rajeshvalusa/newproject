package com.student.dto.error;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private Integer errorResponseCode;
    private String description;
    private String message;
    @JsonIgnore
    private Throwable cause;
}
