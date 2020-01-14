package com.yixin.springboot;

import io.jsonwebtoken.*;

import java.text.SimpleDateFormat;


public class PraseJwt {
    public static void main(String[] args) {
        try {
            Claims claims=Jwts.parser().setSigningKey("yixin")
                    .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NjYiLCJzdWIiOiLlsI_pqawiLCJpYXQiOjE1NjEzNDI1MDgsImV4cCI6MTU2MTM0MjU2OCwicm9sZSI6ImFkbWluIn0.WxmfBoH3gZiAxjfc1ujFvDv763Nx0_LT9mFpvKjCcDo")
                    .getBody();
            System.out.println("用户id："+ claims.getId());
            System.out.println("用户名："+ claims.getSubject());
            System.out.println("登录时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getIssuedAt()));
            System.out.println("过期时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getExpiration()));
            System.out.println("用户角色："+claims.get("role"));
        } catch (ExpiredJwtException e) {
            System.out.println("Token已过期,请重新获取");

        }

    }
}
