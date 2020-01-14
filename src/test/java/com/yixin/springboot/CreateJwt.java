package com.yixin.springboot;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class CreateJwt {
    public static void main(String[] args) {
       JwtBuilder jwtBuilder= Jwts.builder()
                .setId("666")
                .setSubject("小马")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256,"yixin")
                .setExpiration(new Date(new Date().getTime()+60000))
                .claim("role","admin");
        System.out.println(jwtBuilder.compact());
    }
}
