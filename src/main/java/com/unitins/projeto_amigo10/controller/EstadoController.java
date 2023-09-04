package com.unitins.projeto_amigo10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitins.projeto_amigo10.model.Estado;
import com.unitins.projeto_amigo10.repository.EstadoRepository;


@RestController
@RequestMapping(value="/estado")
public class EstadoController {

	@Autowired
	private EstadoRepository repository;
	
	
	@PostMapping(value="/cadastro")
	public Estado cadastrar(@RequestBody Estado estado) {
	
		return repository.save(estado);
	}
	
}
