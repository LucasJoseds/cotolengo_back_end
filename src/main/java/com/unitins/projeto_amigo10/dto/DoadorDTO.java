package com.unitins.projeto_amigo10.dto;

import java.time.LocalDate;

public class DoadorDTO extends PessoaFisicaDTO {

	private Long id;
	private String tipoContribuicao;
	private boolean recorrente;
	private double valor;
	private boolean notificacao;
	private LocalDate dataContribuicao;
	private Long pessoaFisica;
	private Long pessoaJuridica;
	private boolean pago;
	private boolean ativo;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoContribuicao() {
		return tipoContribuicao;
	}
	public void setTipoContribuicao(String tipoContribuicao) {
		this.tipoContribuicao = tipoContribuicao;
	}
	public boolean isRecorrente() {
		return recorrente;
	}
	public void setRecorrente(boolean recorrente) {
		this.recorrente = recorrente;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isNotificacao() {
		return notificacao;
	}
	public void setNotificacao(boolean notificacao) {
		this.notificacao = notificacao;
	}
	public LocalDate getDataContribuicao() {
		return dataContribuicao;
	}
	public void setDataContribuicao(LocalDate dataContribuicao) {
		this.dataContribuicao = dataContribuicao;
	}
	public Long getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(Long pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public Long getPessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(Long pessoaJuridica) {
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
	

	
}
