package sideproject.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sideproject.domain.user.entity.User;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserDto {

    private String id;
    private String email;
    private String password;
    private String name;
    private String nickname;
    private String role;

    public User toEntity(){
        return User.builder()
                .email(email)
                .password(password)
                .name(name)
                .nickname(nickname)
                .role(role)
                .build();
    }
}
