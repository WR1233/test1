package com.lc.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtils {

    private static final String SECURITY_KEY = "qf666666";

    //token过期时间为2小时
    private static final long EXP_TIME = 1000 * 60*60*2;

    public static String createToken(Map claims,String username){
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXP_TIME))
                .signWith(SignatureAlgorithm.HS256,SECURITY_KEY)
                .compact();
    }

    public static Claims parseBody(String jwtToken){
        return (Claims) Jwts.parser().setSigningKey(SECURITY_KEY)
                .parse(jwtToken).getBody();
    }

    public static String parseUsername(String jwtToken){
        Claims claims = parseBody(jwtToken);

        return claims.getSubject();
    }
}
