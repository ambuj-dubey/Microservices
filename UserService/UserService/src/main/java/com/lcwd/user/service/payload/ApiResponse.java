package com.lcwd.user.service.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;
}
