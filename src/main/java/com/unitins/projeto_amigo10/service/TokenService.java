// package com.unitins.projeto_amigo10.service;

// import java.time.LocalDateTime;
// import java.time.ZoneOffset;
// import java.util.Date;

// import org.springframework.stereotype.Service;

// import com.auth0.jwt.JWT;
// import com.auth0.jwt.algorithms.Algorithm;
// import com.unitins.projeto_amigo10.model.UsuarioAdmin;

// @Service
// public class TokenService {

//     public String gerarToken(UsuarioAdmin user) {

//         return JWT.create()
//                 .withIssuer("Doador")
//                 .withSubject(user.getUsername())
//                 .withClaim("id", user.getId())
//                 .withExpiresAt(LocalDateTime.now().plusMinutes(1).toInstant(ZoneOffset.of("-03:00")))
//                 .sign(Algorithm.HMAC256("secreta"));

//     }

//     public String getSubject(String token) {
//         return JWT.require(Algorithm.HMAC256("secreta"))
//                 .withIssuer("Doador")
//                 .build().verify(token).getSubject();

//     }

// }
