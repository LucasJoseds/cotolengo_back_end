package com.unitins.projeto_amigo10.dto;

import com.unitins.projeto_amigo10.model.Cidade;

public class EnderecoDTO {

	
	private Long id;
	
	private String cep;
	
	private String rua;
	
	private String pontoReferencia;

	private Long pessoaFisica;

	private Long pessoaJuridica;
	
	private Long cidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
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

	public Long getCidade() {
		return cidade;
	}

	public void setCidade(Long cidade) {
		this.cidade = cidade;
	}

	
	
	
			
}
