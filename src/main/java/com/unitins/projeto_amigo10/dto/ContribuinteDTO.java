package com.unitins.projeto_amigo10.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.unitins.projeto_amigo10.model.PessoaFisica;
import com.unitins.projeto_amigo10.model.PessoaJuridica;

public class ContribuinteDTO {

	
    private Long id;
	
	
	private String descricao;
	
	
	private LocalDate dataRecebimento;
	
	
	private boolean deveBuscar;
	
	private Long pessoaFisica;
	

	private Long pessoaJuridica;
	
	private boolean recebido;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public LocalDate getDataRecebimento() {
		return dataRecebimento;
	}


	public void setDataRecebimento(LocalDate dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	


	public boolean isDeveBuscar() {
		return deveBuscar;
	}


	public void setDeveBuscar(boolean deveBuscar) {
		this.deveBuscar = deveBuscar;
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


	public boolean isRecebido() {
		return recebido;
	}


	public void setRecebido(boolean recebido) {
		this.recebido = recebido;
	}
	

}
