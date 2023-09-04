// package com.unitins.projeto_amigo10.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.unitins.projeto_amigo10.model.UsuarioAdmin;
// import com.unitins.projeto_amigo10.repository.UsuarioAdminRepository;

// @RestController
// @RequestMapping(value="/user")
// public class UsuarioAdmController {

// 	@Autowired
// 	UsuarioAdminRepository usuarioRepository;
	
// 	private BCryptPasswordEncoder passwordEncoder() {
// 		return new BCryptPasswordEncoder();
// 	}
	
	
// 	@PostMapping(value="/add")
// 	public UsuarioAdmin add(@RequestBody UsuarioAdmin usuario) {		
// 		usuario.setPassword(passwordEncoder().encode(usuario.getPassword()));
// 		return usuarioRepository.save(usuario);
// 	}
	
// 	@GetMapping(value="/home")
// 	public String home() {
		
// 		return "Testando";
// 	}
// }
