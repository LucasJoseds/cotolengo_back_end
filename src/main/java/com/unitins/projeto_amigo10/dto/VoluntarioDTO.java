package com.unitins.projeto_amigo10.dto;


public class VoluntarioDTO {

	
	private Long id;
	
	private String areaAtuacao;

	private String disponibilidade;
	
	private String observacao;

	private Long pessoaFisica;
	
	private Long pessoaJuridica;

	private boolean ativo;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	
	
}



