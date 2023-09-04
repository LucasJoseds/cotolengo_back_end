package com.unitins.projeto_amigo10.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitins.projeto_amigo10.dto.DoadorDTO;
import com.unitins.projeto_amigo10.exceptions.MessagesExceptions;
import com.unitins.projeto_amigo10.model.ComprovanteDoacao;
import com.unitins.projeto_amigo10.model.Doador;
import com.unitins.projeto_amigo10.model.PessoaFisica;
import com.unitins.projeto_amigo10.model.PessoaJuridica;
import com.unitins.projeto_amigo10.model.TipoContribuicao;
import com.unitins.projeto_amigo10.repository.DoadorRepository;

@Service
public class DoadorService {

	@Autowired
	private DoadorRepository doadorRepository;

	@Autowired
	private PessoaFisicaService pessoaFisicaService;

	@Autowired
	private PessoaJuridicaService pessoaJuridicaService;

	@Autowired
	private ComprovanteDoacaoService comprovanteDoacaoService;

	public Doador criarDoador(DoadorDTO dto) {

		Doador doador = new Doador();
		if (dto.getPessoaFisica() != null) {
			PessoaFisica pessoaFisica = pessoaFisicaService.buscarPorId(dto.getPessoaFisica());
			doador = new Doador(dto, pessoaFisica);
		} else if (dto.getPessoaJuridica() != null) {
			PessoaJuridica pessoaJuridica = pessoaJuridicaService.buscarPorId(dto.getPessoaJuridica());
			doador = new Doador(dto, pessoaJuridica);
		}

		return doadorRepository.save(doador);
	}

	public Doador editar(Long id, DoadorDTO dto) {

		Optional<Doador> doadorAntigo = doadorRepository.findById(id);
		if (!doadorAntigo.isPresent()) {
			throw new MessagesExceptions("Doador não encontrado na base de dados");
		}

		Doador doador = doadorAntigo.get();

		doador.setContribuicao(TipoContribuicao.valueOf(dto.getTipoContribuicao()));
		doador.setRecorrente(dto.isRecorrente());
		doador.setDataContribuicao(dto.getDataContribuicao());
		doador.setNotificacao(dto.isNotificacao());
		doador.setValor(dto.getValor());

		return doadorRepository.save(doador);
	}

	@Transactional
	public void desativar(Long id) {

		Doador entity = doadorRepository.findById(id).get();
		entity.setAtivo(false);
	}

	@Transactional
	public void ativar(Long id) {

		Doador entity = doadorRepository.findById(id).get();
		entity.setAtivo(true);

	}

	public ComprovanteDoacao confirmarPagamento(Long id) {

		Doador entity = doadorRepository.findById(id).get();
		if (entity.getId() == null) {
			throw new MessagesExceptions("Doador não encontrado na base de dados");
		} else if (!entity.isAtivo()) {
			throw new MessagesExceptions("Nao é possivel concluir esta ação , pois este doador não esta mais ativo");
		}
		// criando uma váriavel para receber a data de contribuição escolhida pelo
		// doador(Amigo 10)
		LocalDate novaData = entity.getDataContribuicao();

		// quando o pagamento for confirmado , será somado 1 mês na data selecionada
		// pelo doador(Amigo 10) caso ele seja recorrente
		if (entity.isRecorrente()) {
			LocalDate dataSomada = novaData.plusMonths(1);
			entity.setPago(false);
			entity.setDataContribuicao(dataSomada);
		}
		return comprovanteDoacaoService.confirmarPagamento(entity.getId());

	}

	public List<ComprovanteDoacao> listarHistoricoDoador(Long id) {

		return comprovanteDoacaoService.listarHistorico(id);
	}

	public Doador buscarPorId(Long id) {

		return doadorRepository.findById(id).get();
	}

	public List<Doador> listarTodos() {

		return doadorRepository.findAll();

	}

	public Integer pagamentosPendentes() {

		return doadorRepository.pagamentosPendentes();
	}

	public Integer pagamentosFeitos() {

		return doadorRepository.pagamentosFeitos();
	}

	public Integer pagamentosVencidos() {

		return doadorRepository.pagamentosVencidos();
	}

	public Integer doadoresInativos() {

		return doadorRepository.doadoresInativos();
	}

	public Double somaPendentes() {

		return doadorRepository.somaPendentes();
	}

	public Double somaPagos() {

		return doadorRepository.somaPagamentosFeitos();
	}

	public Double somaVencidos() {

		return doadorRepository.somaVencidos();
	}

	public List<Doador> listarPendentes() {

		return doadorRepository.listarPendentes();
	}

	public List<Doador> listarPagos() {

		return doadorRepository.listarPagos();
	}

	public List<Doador> listarVencidos() {

		return doadorRepository.listarVencidos();
	}

	public List<Doador> listarInativos() {

		return doadorRepository.listarInativos();
	}

}
