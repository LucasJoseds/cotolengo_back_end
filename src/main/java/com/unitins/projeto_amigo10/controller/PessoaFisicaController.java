package com.unitins.projeto_amigo10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitins.projeto_amigo10.dto.PessoaFisicaDTO;
import com.unitins.projeto_amigo10.model.PessoaFisica;
import com.unitins.projeto_amigo10.service.PessoaFisicaService;

@RestController
@RequestMapping(value="/pessoa-fisica")
@CrossOrigin("*")
public class PessoaFisicaController {

	
	@Autowired
	private PessoaFisicaService service;
	
	@PostMapping(value="/cadastro")
	public PessoaFisica cadastrar(@RequestBody PessoaFisicaDTO dto) {
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome(dto.getNome());
		pf.setCpf(dto.getCpf());
		pf.setEmail(dto.getEmail());
		pf.setDataNascimento(dto.getDataNascimento());
		pf.setNumeroTelefone(dto.getNumeroTelefone());
		pf.setNumeroWhats(dto.getNumeroWhats());
		
		
		return service.cadastrar(pf);
		
	}
	
	@GetMapping(value="/listar-todos")
	public List<PessoaFisica> listarTodos(){
		
		return service.listarTodos();
	}
}
