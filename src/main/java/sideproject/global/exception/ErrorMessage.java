package sideproject.global.exception;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ErrorMessage {
    private final String message;
    private final LocalDateTime createdAt;

    public ErrorMessage(String message) {
        this.message = message;
        this.createdAt = LocalDateTime.now();
    }
}
