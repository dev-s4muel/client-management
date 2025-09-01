package com.neoapplications.client_management.service;

import com.neoapplications.client_management.dto.user.UserDto;

import java.util.UUID;

public interface UserService {
    void registerUser(UserDto userDto);

    void deactivateUserById(UUID id);
}