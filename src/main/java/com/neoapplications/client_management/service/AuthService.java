package com.neoapplications.client_management.service;

import com.neoapplications.client_management.dto.login.LoginRequestDto;

public interface AuthService {

    String authenticate(LoginRequestDto loginRequest);
}