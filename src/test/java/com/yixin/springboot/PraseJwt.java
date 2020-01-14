package com.yixin.springboot;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;

import java.text.SimpleDateFormat;


public class PraseJwt {
    public static void main(String[] args) {
        try {
            Claims claims = Jwts.parser().setSigningKey("yixin").parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NjYiLCJzdWIiOiLlsI_pqawiLCJpYXQiOjE1Nzg5ODk0NzgsImV4cCI6MTU3ODk4OTUzOCwicm9sZSI6ImFkbWluIn0.01YdocD7rz4jMqDdQ82egde-tfRvBUWd7XPZDCqe1KE").getBody();
            System.out.println("用户id：" + claims.getId());
            System.out.println("用户名：" + claims.getSubject());
            System.out.println("登录时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getIssuedAt()));
            System.out.println("过期时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getExpiration()));
            System.out.println("用户角色：" + claims.get("role"));
        } catch (ExpiredJwtException e) {
            System.out.println("Token已过期,请重新获取");

        }

    }
}
