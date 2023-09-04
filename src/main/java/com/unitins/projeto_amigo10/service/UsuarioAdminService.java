//package com.unitins.projeto_amigo10.service;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
//import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
//import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UsuarioService implements OAuth2UserService<OAuth2UserRequest, OAuth2User> {
//	
//	@Override
//    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
//        // Carregue os atributos do usuário do provedor de autenticação do Google
//        OAuth2User oauth2User = super.loadUser(userRequest);
//
//        // Construa uma implementação personalizada de UserDetails com base nos atributos do usuário
//        UserDetails userDetails = buildUserDetails(oauth2User);
//
//        return (OAuth2User) userDetails;
//    }
//
//    private UserDetails buildUserDetails(OAuth2User oauth2User) {
//        // Extrair os atributos do usuário do oauth2User e construir a implementação de UserDetails
//        // ...
//
//        return new Usuario(email,authorities);
//    }
//
//}