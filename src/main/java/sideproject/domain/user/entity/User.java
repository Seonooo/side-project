package sideproject.domain.user.entity;

import lombok.*;
import sideproject.global.entity.BaseTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User extends BaseTime {

    @Id
    @Column(nullable = false, length = 20)
    private String id;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, length = 20)
    private String name;
    @Column(nullable = false, length = 32)
    private String password;
    @Column(nullable = false, length = 12)
    private String nickname;
    @Column(nullable = false, length = 20)
    private String role;

    @Builder
    public User(String id, String email, String name, String password, String nickname, String role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        this.role = role;
    }
}
