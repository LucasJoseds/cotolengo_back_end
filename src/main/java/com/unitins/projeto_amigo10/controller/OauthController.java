// package com.unitins.projeto_amigo10.controller;

// import java.security.Principal;
// import java.util.HashSet;
// import java.util.Set;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
// import org.springframework.security.oauth2.core.user.OAuth2User;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;


// @RestController
// @RequestMapping(value="/login")
// public class UsuarioController {


	
// 	@GetMapping("/user")
//     public ResponseEntity<String> getUserInfo(Principal principal) {
//         if (principal instanceof OAuth2AuthenticationToken) {
//             OAuth2AuthenticationToken oauthToken = (OAuth2AuthenticationToken) principal;
//             OAuth2User oauth2User = oauthToken.getPrincipal();
            
          
//             String email = oauth2User.getAttribute("email");
//             String name = oauth2User.getAttribute("name");
            
//             // Verifique o domínio do e-mail para determinar o papel do usuário
//             Set<GrantedAuthority> authorities = new HashSet<>();
            
//             if (email.equals("lucasjs088@gmail.com")) {
//                 // Usuário é um administrador
            	
//             	authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            	
//                 return ResponseEntity.ok("Olá Admin: " + name);
//             } else {
//             	 authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//             }
//         }
        
//         return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not authenticated");
//     }
	
// }
