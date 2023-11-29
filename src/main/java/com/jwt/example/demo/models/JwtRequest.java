package com.jwt.example.demo.models;

import lombok.*;

import java.security.PrivateKey;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtRequest {
    private  String email;
    private String password;
}
