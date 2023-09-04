package com.unitins.projeto_amigo10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitins.projeto_amigo10.dto.DoadorDTO;
import com.unitins.projeto_amigo10.model.ComprovanteDoacao;
import com.unitins.projeto_amigo10.model.Doador;
import com.unitins.projeto_amigo10.service.DoadorService;


@RestController
@RequestMapping(value = "/doador")
public class DoadorController {

	
	@Autowired
	private DoadorService doadorService;

	@PostMapping(value = "/cadastro-pf")
	public ResponseEntity<Doador> cadastroPF(@RequestBody DoadorDTO dto) {

			Doador novoDoador = doadorService.criarDoador(dto);
			return new ResponseEntity<Doador>(novoDoador, HttpStatus.CREATED);
	}

	@PostMapping(value = "/cadastro-pj")
	public ResponseEntity<Doador> cadastroPJ(@RequestBody DoadorDTO dto) {
			Doador novoDoador = doadorService.criarDoador(dto);
			return new ResponseEntity<Doador>(novoDoador, HttpStatus.CREATED);

	}

	@PutMapping(value = "/editar/{id}")
	public ResponseEntity<Doador> editar(@PathVariable Long id, @RequestBody DoadorDTO dto) {

		Doador doadorEditado = doadorService.editar(id, dto);
		return new ResponseEntity<Doador>(doadorEditado, HttpStatus.CREATED);
		
	}

	@GetMapping(value = "/listar-todos")
	public List<Doador> listarTodos() {
		return doadorService.listarTodos();
	}

	@PatchMapping(value = "/desativar/{id}")
	public ResponseEntity<String> inativar(@PathVariable Long id) {
			doadorService.desativar(id);
			return ResponseEntity.ok().body("Doador desativado com sucesso");	

	}

	@PatchMapping(value = "/ativar/{id}")
	public void ativar(@PathVariable Long id) {
		doadorService.ativar(id);
	}

	@PatchMapping(value = "/confirmar-pagamento/{id}")
	public ResponseEntity<ComprovanteDoacao> confirmarPagamento(@PathVariable Long id) {

		ComprovanteDoacao doadorPago = doadorService.confirmarPagamento(id);
		return new ResponseEntity<ComprovanteDoacao>(doadorPago, HttpStatus.OK);		
	}

	@GetMapping(value = "/historico/{id}")
	public ResponseEntity<ComprovanteDoacao> listarHistorico(@PathVariable Long id) {

		List<ComprovanteDoacao> listaHistorico = doadorService.listarHistoricoDoador(id);
		return new ResponseEntity(listaHistorico,HttpStatus.OK);

	}

}
