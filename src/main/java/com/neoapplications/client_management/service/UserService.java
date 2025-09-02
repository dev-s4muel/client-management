package com.neoapplications.client_management.service;

import com.neoapplications.client_management.dto.user.UserRequestDto;
import com.neoapplications.client_management.dto.user.UserResponseDto;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface UserService {
    void registerUser(UserRequestDto userRequestDto);

    void deactivateUserById(UUID id);

    UserResponseDto update(UUID userId, UserRequestDto userRequestDto);

    Page<UserResponseDto> listUsers(int page, int size, String sort);
}