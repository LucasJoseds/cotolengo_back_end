package com.unitins.projeto_amigo10.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitins.projeto_amigo10.dto.ContribuinteDTO;
import com.unitins.projeto_amigo10.exceptions.MessagesExceptions;
import com.unitins.projeto_amigo10.model.Contribuinte;
import com.unitins.projeto_amigo10.model.PessoaFisica;
import com.unitins.projeto_amigo10.model.PessoaJuridica;
import com.unitins.projeto_amigo10.repository.ContribuinteRepository;

@Service
public class ContribuinteService {

	@Autowired
	private ContribuinteRepository repository;

 	@Autowired
	private PessoaFisicaService pessoaFisicaService;

	@Autowired
	private PessoaJuridicaService pessoaJuridicaService;

	
	public Contribuinte criarContribuinte(ContribuinteDTO dto) {

		Contribuinte contribuinte = new Contribuinte();
		if (dto.getPessoaFisica() != null) {
			PessoaFisica pessoaFisica = pessoaFisicaService.buscarPorId(dto.getPessoaFisica());
			 contribuinte = new Contribuinte(dto, pessoaFisica);

		} else if (dto.getPessoaJuridica() != null) {
			PessoaJuridica pessoaJuridica = pessoaJuridicaService.buscarPorId(dto.getPessoaJuridica());
			 contribuinte = new Contribuinte(dto, pessoaJuridica);
		}

		return repository.save(contribuinte);
	}

	public Contribuinte editar(Long id , ContribuinteDTO dto) {

		Optional<Contribuinte> contribuinte = repository.findById(id);
		if(!contribuinte.isPresent()){
			throw new MessagesExceptions("Contribuinte não encontrado na base de dados");
		}
		Contribuinte novoContribuinte = contribuinte.get();

		return repository.save(novoContribuinte);
	}

	@Transactional
	public Contribuinte confirmarRecebimento(Long id){

		Contribuinte contribuinte = repository.findById(id).get();
		contribuinte.setRecebido(true);
		return repository.save(contribuinte);
	}

	public Contribuinte buscarPorId(Long id) {

		return repository.findById(id).get();
	}

	public List<Contribuinte> listarTodos() {

		return repository.findAll();

	}

	public Integer contribuicaoPendente() {

		return repository.contibuicoesPendentes();
	}

	public Integer contribuicaoPaga() {

		return repository.contribuicoesPagas();
	}

	public List<Contribuinte> listarPendentes() {

		return repository.listarPendentes();
	}

	public List<Contribuinte> listarPagos() {

		return repository.listarPagos();
	}
}
