package sideproject.global.exception.user;

import lombok.Getter;

@Getter
public class DuplicateEmailException extends RuntimeException {

    private static final String message = "이메일이 중복됩니다.";
    private final String email;

    public DuplicateEmailException(String email) {
        super(message);
        this.email = email;
    }
}
