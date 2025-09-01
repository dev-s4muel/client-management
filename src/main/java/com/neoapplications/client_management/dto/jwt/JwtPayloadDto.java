package com.neoapplications.client_management.dto.jwt;

import com.neoapplications.client_management.model.auth.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtPayloadDto {
    private String email;
    private RoleEnum role;
}