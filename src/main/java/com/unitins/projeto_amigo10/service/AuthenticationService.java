// package com.unitins.projeto_amigo10.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.unitins.projeto_amigo10.repository.UsuarioAdminRepository;

// @Service
// public class AuthenticationService implements UserDetailsService {

//     @Autowired
//     private UsuarioAdminRepository usuarioAdminRepository;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//         try {
//             return usuarioAdminRepository.findByEmail(username);

//         } catch (Exception e) {
//             throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
//         }

//     }

// }
