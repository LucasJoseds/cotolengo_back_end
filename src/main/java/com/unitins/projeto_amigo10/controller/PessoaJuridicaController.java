package com.unitins.projeto_amigo10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitins.projeto_amigo10.model.PessoaJuridica;
import com.unitins.projeto_amigo10.service.PessoaJuridicaService;


@RestController
@RequestMapping(value="/pessoa-juridica")
public class PessoaJuridicaController {

	
	@Autowired
	private PessoaJuridicaService service;
	
	@PostMapping(value="/cadastro")
	public PessoaJuridica cadastrar(@RequestBody PessoaJuridica pj) {
		
		return service.cadastrar(pj);
		
	}
	
	
	@PutMapping(value="editar/{id}")
	public PessoaJuridica editar(@PathVariable Long id, @RequestBody PessoaJuridica pj) {
		
		PessoaJuridica entity = service.buscarPorId(id);
		
		entity.setNomeEmpresa(pj.getNomeEmpresa());
		entity.setCnpj(pj.getCnpj());
		entity.setEmail(pj.getEmail());
		entity.setNumeroTelefone(pj.getNumeroTelefone());
		entity.setNumeroWhats(pj.getNumeroWhats());
		
		return service.editar(entity);
	}
	
	
	@GetMapping(value="/listar-todos")
	public List<PessoaJuridica> listarTodos(){
		
		return service.listarTodos();
	}
}
