package com.unitins.projeto_amigo10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitins.projeto_amigo10.model.PessoaFisica;
import com.unitins.projeto_amigo10.repository.PessoaFisicaRepository;

@Service
public class PessoaFisicaService {

	
	@Autowired
	private PessoaFisicaRepository repository;
	
	
	public PessoaFisica cadastrar(PessoaFisica pf) {
		
		return repository.save(pf);
	}
	
	
	public PessoaFisica buscarPorId(Long id) {
		return repository.findById(id).get();		
	}
	
	public List<PessoaFisica>listarTodos(){
		
		return repository.findAll();
	}
}
