package com.jwt.example.demo.models;

import lombok.*;

import java.sql.Struct;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponse {
    private String jwtToken;
    private String username;
}
