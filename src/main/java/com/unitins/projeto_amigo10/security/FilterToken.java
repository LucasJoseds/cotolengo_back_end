// package com.unitins.projeto_amigo10.security;

// import java.io.IOException;

// import javax.servlet.FilterChain;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.stereotype.Component;
// import org.springframework.web.filter.OncePerRequestFilter;

// import com.unitins.projeto_amigo10.repository.UsuarioAdminRepository;
// import com.unitins.projeto_amigo10.service.TokenService;

// @Component
// public class FilterToken extends OncePerRequestFilter {

// 	@Autowired
// 	private TokenService tokenService;

// 	@Autowired
// 	private UsuarioAdminRepository usuarioRepository;



// 	@Override
// 	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
// 			throws ServletException, IOException {

// 		String token;

// 		var authorizationHeader = request.getHeader("Authorization");

// 		if (authorizationHeader != null) {

// 			token = authorizationHeader.replace("Bearer ", "");
// 			var subject = tokenService.getSubject(token);

// 			var usuario = usuarioRepository.findByEmail(subject);

// 			var authentication = new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());

// 			SecurityContextHolder.getContext().setAuthentication(authentication);
// 		}

// 		filterChain.doFilter(request, response);

// 	}

// }
