package com.neoapplications.client_management.dto.jwt;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JwtResponseDto {

    private String token;
    private String type;

    public JwtResponseDto(String token) {
        this.type = "Bearer";
        this.token = token;
    }
}