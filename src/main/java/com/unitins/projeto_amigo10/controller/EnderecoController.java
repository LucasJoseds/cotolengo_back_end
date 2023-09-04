package com.unitins.projeto_amigo10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitins.projeto_amigo10.dto.EnderecoDTO;
import com.unitins.projeto_amigo10.model.Cidade;
import com.unitins.projeto_amigo10.model.Endereco;
import com.unitins.projeto_amigo10.model.PessoaFisica;
import com.unitins.projeto_amigo10.repository.CidadeRepository;
import com.unitins.projeto_amigo10.service.EnderecoService;
import com.unitins.projeto_amigo10.service.PessoaFisicaService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@PostMapping(value = "/cadastro")
	public ResponseEntity<Endereco> cadastrar(@RequestBody EnderecoDTO dto) {

		Endereco nEndereco = enderecoService.criarEndereco(dto);
		return new ResponseEntity<Endereco>(nEndereco, HttpStatus.CREATED);
	}

	// @GetMapping(value = "listar-todos")
	// public List<Endereco> listar() {

	// 	return es.listar();

	// }
}
