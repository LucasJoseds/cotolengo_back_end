package com.unitins.projeto_amigo10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitins.projeto_amigo10.dto.CidadeDTO;
import com.unitins.projeto_amigo10.model.Cidade;
import com.unitins.projeto_amigo10.model.Estado;
import com.unitins.projeto_amigo10.repository.CidadeRepository;
import com.unitins.projeto_amigo10.repository.EstadoRepository;

@RequestMapping(value="/cidade")
@RestController
public class CidadeController {

	
	@Autowired
	private CidadeRepository repository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	
	
	@PostMapping(value="/cadastro")
	public Cidade cadastrar(@RequestBody CidadeDTO dto) {
		
		Estado estado = estadoRepository.findById(dto.getEstado()).get();
		
		Cidade entity = new Cidade();
		
		entity.setNome(dto.getNome());
		entity.setEstado(estado);
		
		return repository.save(entity);
	}
}
