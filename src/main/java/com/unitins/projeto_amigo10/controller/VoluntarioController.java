package com.unitins.projeto_amigo10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unitins.projeto_amigo10.dto.VoluntarioDTO;
import com.unitins.projeto_amigo10.model.Voluntario;
import com.unitins.projeto_amigo10.service.VoluntarioService;

@RestController
@RequestMapping(value = "/voluntario")
public class VoluntarioController {

	@Autowired
	private VoluntarioService voluntarioService;

	@PostMapping(value = "/cadastro-pf")
	public ResponseEntity<Voluntario> cadastrarPF(@RequestBody VoluntarioDTO dto) {

			Voluntario novoVoluntario = voluntarioService.criarVoluntario(dto);
			return new ResponseEntity<Voluntario>(novoVoluntario, HttpStatus.CREATED);

	}

	@PostMapping(value = "/cadastro-pj")
	public ResponseEntity<Voluntario> cadastrarPJ(@RequestBody VoluntarioDTO dto) {
	
			Voluntario novoVoluntarioPJ = voluntarioService.criarVoluntario(dto);
			return new ResponseEntity<Voluntario>(novoVoluntarioPJ, HttpStatus.CREATED);
		
	}

	@PutMapping(value = "/editar/{id}")
	public ResponseEntity<Voluntario> editar(@PathVariable Long id, @RequestBody VoluntarioDTO dto) throws Exception {

		Voluntario voluntarioEditado = voluntarioService.editar(id,dto);
		return new ResponseEntity<Voluntario>(voluntarioEditado, HttpStatus.CREATED);
		
	}

	@PatchMapping(value = "/ativar/{id}")
	public void ativar(@PathVariable Long id) {
		voluntarioService.ativar(id);
	}

	@PatchMapping(value = "/desativar/{id}")
	public void desativar(@PathVariable Long id) {

		voluntarioService.desativar(id);

	}

	@GetMapping(value = "listar-todos")
	public List<Voluntario> listarTodos() {

		return voluntarioService.listarTodos();
	}
}
