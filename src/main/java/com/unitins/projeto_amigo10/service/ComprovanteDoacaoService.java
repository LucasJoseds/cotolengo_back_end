package com.unitins.projeto_amigo10.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitins.projeto_amigo10.model.ComprovanteDoacao;
import com.unitins.projeto_amigo10.model.Doador;
import com.unitins.projeto_amigo10.repository.ComprovanteDoacaoRepository;

@Service
public class ComprovanteDoacaoService {

	@Autowired
	private DoadorService doadorService;
	
	@Autowired
	private ComprovanteDoacaoRepository repository;
	
	public ComprovanteDoacao confirmarPagamento(Long id) {
		
		Doador doador = doadorService.buscarPorId(id);
		
		if(!doador.isRecorrente()) {		
			doador.setPago(true);
		}
			
		ComprovanteDoacao entity = new ComprovanteDoacao();
		entity.setDoador(doador);
		entity.setDataDoacao(LocalDate.now());
	
		return repository.save(entity);
		
	}
	
	public List<ComprovanteDoacao> listarHistorico(Long id){
		
		return repository.hitoricoPagamentos(id);
	}
}
