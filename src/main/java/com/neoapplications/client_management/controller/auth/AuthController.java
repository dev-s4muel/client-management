package com.neoapplications.client_management.controller.auth;

import com.neoapplications.client_management.dto.jwt.JwtResponseDto;
import com.neoapplications.client_management.dto.login.LoginRequestDto;
import com.neoapplications.client_management.dto.user.UserDto;
import com.neoapplications.client_management.service.AuthService;
import com.neoapplications.client_management.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/auth")
public class AuthController {

    private final UserService userService;

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Void> createNewAccount(@Valid @RequestBody UserDto userDto) {
        log.info("Tentativa de registro para o email: {}", userDto.getEmail());
        userService.registerUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponseDto> login(@RequestBody @Valid LoginRequestDto loginRequest) {
        log.info("Tentativa de login para o email: {}", loginRequest.getEmail());
        String token = authService.authenticate(loginRequest);
        return ResponseEntity.status(HttpStatus.OK).body(new JwtResponseDto(token));
    }
}
