package com.neoapplications.client_management.service;

import com.neoapplications.client_management.dto.user.UserDto;

public interface UserService {
    void registerUser(UserDto userDto);
}