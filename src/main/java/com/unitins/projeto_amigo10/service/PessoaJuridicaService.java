package com.unitins.projeto_amigo10.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.unitins.projeto_amigo10.model.PessoaJuridica;
import com.unitins.projeto_amigo10.repository.PessoaJuridicaRepository;

@Service
public class PessoaJuridicaService {

	@Autowired
	private PessoaJuridicaRepository repository;


	
	public PessoaJuridica cadastrar(PessoaJuridica pj) {

		return repository.save(pj);
	}

	public PessoaJuridica editar(PessoaJuridica pj) {

		Objects.requireNonNull(pj.getId());

		return repository.save(pj);
	}

	public PessoaJuridica buscarPorId(Long id) {
		return repository.findById(id).get();
	}

	
	public List<PessoaJuridica> listarTodos() {

		return repository.findAll();

	}
}
