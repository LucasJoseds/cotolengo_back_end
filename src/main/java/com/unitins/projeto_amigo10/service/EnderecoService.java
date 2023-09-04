package com.unitins.projeto_amigo10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitins.projeto_amigo10.dto.EnderecoDTO;
import com.unitins.projeto_amigo10.model.Cidade;
import com.unitins.projeto_amigo10.model.Endereco;
import com.unitins.projeto_amigo10.model.PessoaFisica;
import com.unitins.projeto_amigo10.model.PessoaJuridica;

import com.unitins.projeto_amigo10.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;
	
	@Autowired
	private CidadeService cidadeService;
	
	@Autowired
	private PessoaFisicaService pessoaFisicaService;

	@Autowired
	private PessoaJuridicaService pessoaJuridicaService;
	
	public Endereco criarEndereco(EnderecoDTO dto) {

		Cidade cidadeN = cidadeService.buscarCidade(dto.getCidade());

		Endereco entity = new Endereco();
		
		entity.setCep(dto.getCep());
		entity.setRua(dto.getRua());
		entity.setPontoReferencia(dto.getPontoReferencia());
		entity.setCidade(cidadeN);

		if(dto.getPessoaFisica()!= null){
			PessoaFisica pessoaFisica = pessoaFisicaService.buscarPorId(dto.getPessoaFisica()); 
			entity.setPessoaFisica(pessoaFisica);
		}
		else if(dto.getPessoaJuridica()!= null){
			PessoaJuridica pessoaJuridica = pessoaJuridicaService.buscarPorId(dto.getPessoaJuridica()); 
			entity.setPessoaJuridica(pessoaJuridica);
		}
	
		return repository.save(entity);
	}
	
	public List<Endereco> listar() {
		
		return repository.findAll();
	}
}
