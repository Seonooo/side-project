package sideproject.domain.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sideproject.domain.user.dto.CreateUserDto;
import sideproject.domain.user.repository.UserRepository;
import sideproject.global.exception.user.DuplicateEmailException;
import sideproject.global.exception.user.DuplicateIdException;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(CreateUserDto createUserDto) {
        validate(createUserDto);
        userRepository.save(createUserDto.toEntity());
    }

    private void validate(CreateUserDto createUserDto) {
        isExistsId(createUserDto.getId());
        isExistsEmail(createUserDto.getEmail());
    }

    private void isExistsId(String id) {
        userRepository.findById(id).ifPresent(user -> new DuplicateIdException(id));
    }

    private void isExistsEmail(String email) {
        userRepository.findByEmail(email).ifPresent(user -> new DuplicateEmailException(email));
    }
}
