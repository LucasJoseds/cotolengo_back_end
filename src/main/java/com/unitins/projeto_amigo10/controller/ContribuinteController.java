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

import com.unitins.projeto_amigo10.dto.ContribuinteDTO;
import com.unitins.projeto_amigo10.model.Contribuinte;
import com.unitins.projeto_amigo10.model.PessoaFisica;
import com.unitins.projeto_amigo10.model.PessoaJuridica;
import com.unitins.projeto_amigo10.service.ContribuinteService;
import com.unitins.projeto_amigo10.service.PessoaFisicaService;
import com.unitins.projeto_amigo10.service.PessoaJuridicaService;

@RestController
@RequestMapping(value="/contribuinte")
public class ContribuinteController {
	
	@Autowired
	private ContribuinteService contribuinteService;

	@PostMapping(value="/cadastro-pf")
	public ResponseEntity<Contribuinte> cadastroPF(@RequestBody ContribuinteDTO dto) {
		
		Contribuinte contribuinte =contribuinteService.criarContribuinte(dto);
		return new ResponseEntity<Contribuinte>(contribuinte, HttpStatus.CREATED);		
	
		
	}
	
	@PostMapping(value="/cadastro-pj")
	public ResponseEntity<Contribuinte> cadastroPJ(@RequestBody ContribuinteDTO dto){
		
		Contribuinte contribuinte =contribuinteService.criarContribuinte(dto);
		return new ResponseEntity<Contribuinte>(contribuinte, HttpStatus.CREATED);
		
	}
	
	@PutMapping(value="/editar/{id}")
	public ResponseEntity<Contribuinte> editar(@PathVariable Long id , @RequestBody ContribuinteDTO dto) {
		
		Contribuinte contribuinte =contribuinteService.editar(id,dto);
		return new ResponseEntity<Contribuinte>(contribuinte, HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/listar-todos")
	public List<Contribuinte> listar() {
		
		return contribuinteService.listarTodos();
		
	}
	
	@PatchMapping(value="/confirmar-recebimento/{id}")
	public ResponseEntity<Contribuinte> confirmarRecebimento(@PathVariable Long id) {
		
		Contribuinte contribuinte = contribuinteService.confirmarRecebimento(id);
		return new ResponseEntity<Contribuinte>(contribuinte, HttpStatus.OK);
	}
	

}
