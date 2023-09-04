package com.unitins.projeto_amigo10.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitins.projeto_amigo10.dto.VoluntarioDTO;
import com.unitins.projeto_amigo10.exceptions.MessagesExceptions;
import com.unitins.projeto_amigo10.model.PessoaFisica;
import com.unitins.projeto_amigo10.model.PessoaJuridica;
import com.unitins.projeto_amigo10.model.Voluntario;
import com.unitins.projeto_amigo10.repository.VoluntarioRepository;

@Service
public class VoluntarioService {

	@Autowired
	private VoluntarioRepository repository;

	@Autowired
	private PessoaFisicaService pessoaFisicaService;

	@Autowired
	private PessoaJuridicaService pessoaJuridicaService;

	public Voluntario criarVoluntario(VoluntarioDTO dto) {

		Voluntario voluntario = new Voluntario();

		if (dto.getPessoaFisica() != null) {
			PessoaFisica pessoaFisica = pessoaFisicaService.buscarPorId(dto.getPessoaFisica());
			voluntario = new Voluntario(dto, pessoaFisica);
		} else if (dto.getPessoaJuridica() != null) {
			PessoaJuridica pessoaJuridica = pessoaJuridicaService.buscarPorId(dto.getPessoaJuridica());
			voluntario = new Voluntario(dto, pessoaJuridica);
		}

		return repository.save(voluntario);
	}

	public Voluntario editar(Long id, VoluntarioDTO dto) throws Exception {

		Optional<Voluntario> voluntario = repository.findById(id);

		if (!voluntario.isPresent()) {
			throw new MessagesExceptions("Voluntário não encontrado na base de dados");
		}
		Voluntario novo = voluntario.get();
		novo.setObservacao(dto.getObservacao());
		novo.setAreaAtuacao(dto.getAreaAtuacao());
		novo.setDisponibilidade(dto.getDisponibilidade());

		return repository.save(novo);

	}

	@Transactional
	public void ativar(Long id) {

		Voluntario entity = repository.findById(id).get();
		entity.setAtivo(true);
	}

	@Transactional
	public void desativar(Long id) {
		Voluntario entity = repository.findById(id).get();
		entity.setAtivo(false);
	}

	public Voluntario buscarPorId(Long id) {

		return repository.findById(id).get();
	}

	public List<Voluntario> listarTodos() {

		return repository.findAll();
	}

	public Integer solicitados() {

		return repository.voluntarioSolicitado();
	}

	public Integer inativos() {

		return repository.voluntariosInativos();
	}

	public Integer ativos() {

		return repository.voluntariosAtivos();
	}

	public List<Voluntario> listarSolicitados() {

		return repository.listarVoluntariosSolicitados();
	}

	public List<Voluntario> listarInativos() {

		return repository.listarInativos();
	}

	public List<Voluntario> listarAtivos() {

		return repository.listarAtivos();
	}

}
