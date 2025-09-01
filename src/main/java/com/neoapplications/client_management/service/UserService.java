package com.neoapplications.client_management.service;

import com.neoapplications.client_management.dto.user.UserRequestDto;
import com.neoapplications.client_management.dto.user.UserResponseDto;

import java.util.UUID;

public interface UserService {
    void registerUser(UserRequestDto userRequestDto);

    void deactivateUserById(UUID id);

    UserResponseDto update(UUID userId, UserRequestDto userRequestDto);
}