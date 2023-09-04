package com.unitins.projeto_amigo10.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.unitins.projeto_amigo10.dto.DoadorDTO;

@Entity
public class Doador {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="tipo_contribuicao")
	@Enumerated(EnumType.STRING)
	private TipoContribuicao contribuicao;
	
	@Column(name="recorrente")
	private boolean recorrente;
	
	@Column(name="data_contribuicao")
	private LocalDate dataContribuicao;
	
	@Column(name="notificacao")
	private boolean notificacao;
	
	@Column(name="valor")
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name="pessoa_fisica_id")
	private PessoaFisica pessoaFisica;
	
	
	@ManyToOne
	@JoinColumn(name="pessoa_juridica_id")
	private PessoaJuridica pessoaJuridica;
	
	@Column(name="pago")
	private boolean pago;
	
	@Column(name="ativo")
	private boolean ativo;
	
	public Doador(){

	}

	public Doador(DoadorDTO dto){

		this.id = dto.getId();
		this.contribuicao = TipoContribuicao.valueOf(dto.getTipoContribuicao());
		this.recorrente = dto.isRecorrente();
		this.dataContribuicao = dto.getDataContribuicao();
		this.notificacao = dto.isNotificacao();
		this.valor = dto.getValor();
		this.pago = dto.isPago();
		this.ativo = dto.isAtivo();
	}

	public Doador(DoadorDTO dto , PessoaFisica pessoaFisica) {

		this.id = dto.getId();
		this.contribuicao = TipoContribuicao.valueOf(dto.getTipoContribuicao());
		this.recorrente = dto.isRecorrente();
		this.dataContribuicao = dto.getDataContribuicao();
		this.notificacao = dto.isNotificacao();
		this.valor = dto.getValor();
		this.pessoaFisica = pessoaFisica;
		this.pago = dto.isPago();
		this.ativo = dto.isAtivo();
	}

	
	public Doador(DoadorDTO dto , PessoaJuridica pessoaJuridica){

		this.id = dto.getId();
		this.contribuicao = TipoContribuicao.valueOf(dto.getTipoContribuicao());
		this.recorrente = dto.isRecorrente();
		this.dataContribuicao = dto.getDataContribuicao();
		this.notificacao = dto.isNotificacao();
		this.valor = dto.getValor();
		this.pessoaJuridica = pessoaJuridica;
		this.pago = dto.isPago();
		this.ativo = dto.isAtivo();
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TipoContribuicao getContribuicao() {
		return contribuicao;
	}
	public void setContribuicao(TipoContribuicao contribuicao) {
		this.contribuicao = contribuicao;
	}
	public boolean isRecorrente() {
		return recorrente;
	}
	public void setRecorrente(boolean recorrente) {
		this.recorrente = recorrente;
	}
	public LocalDate getDataContribuicao() {
		return dataContribuicao;
	}
	public void setDataContribuicao(LocalDate dataContribuicao) {
		this.dataContribuicao = dataContribuicao;
	}
	public boolean isNotificacao() {
		return notificacao;
	}
	public void setNotificacao(boolean notificacao) {
		this.notificacao = notificacao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doador other = (Doador) obj;
		return Objects.equals(id, other.id);
	}
	

	
}
