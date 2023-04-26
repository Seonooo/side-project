package sideproject.global.exception.user;

import lombok.Getter;

@Getter
public class DuplicateIdException extends RuntimeException {

    private static final String message = "이미 존재하는 아이디입니다.";
    private final String userId;

    public DuplicateIdException(String userId) {
        super(message);
        this.userId = userId;
    }
}
