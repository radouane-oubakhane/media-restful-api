package com.radouanex.restfulwebservices.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timetamp;
    private String message;
    private String details;

    public ErrorDetails(LocalDateTime timetamp, String message, String details) {
        this.timetamp = timetamp;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimetamp() {
        return timetamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
