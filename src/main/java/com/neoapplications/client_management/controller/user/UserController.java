package com.neoapplications.client_management.controller.user;

import com.neoapplications.client_management.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;


    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deactivateUserById(
            @PathVariable UUID id,
            @RequestHeader(name = "Authorization", required = true) String token) {
        log.info("Tentativa de inativar usuario com id {} no sistema.", id);

        userService.deactivateUserById(id);
        return ResponseEntity.noContent().build();
    }
}