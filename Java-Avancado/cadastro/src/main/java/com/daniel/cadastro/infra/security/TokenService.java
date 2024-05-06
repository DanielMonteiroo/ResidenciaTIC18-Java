package com.daniel.cadastro.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.daniel.cadastro.usuarios.Usuarios;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    //Metodo para geração do TOKEN
    public String geradorToken(Usuarios usuario){

        try {

            Algorithm algoritimo = Algorithm.HMAC256(secret);
            String token = JWT.create()
                    .withIssuer("auth-api")
                    .withSubject(usuario.getLogin())
                    .withExpiresAt(dataExpiracao())
                    .sign(algoritimo);
            return token;

        } catch (JWTCreationException exception) {
            throw new RuntimeException("Erro na geração de TOKEN",exception);
        }

    }

    //Metodo do tempo de expiração do TOKEN
    private Instant dataExpiracao(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }

    //Metodo para validação do TOKEN
    public String validaToken(String token){
        try {
            Algorithm algoritimo = Algorithm.HMAC256(secret);
           return JWT.require(algoritimo)
                   .withIssuer("auth-api")
                   .build()
                   .verify(token)
                   .getSubject();

        } catch (JWTVerificationException exception) {
           return "";
        }
    }

}
