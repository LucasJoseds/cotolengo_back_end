package com.unitins.projeto_amigo10.dto;

import java.time.LocalDate;


public class PessoaFisicaDTO {


	private String nome;
	
	private String email;
	
	private String numeroTelefone;
	
	private String numeroWhats;
	
	private LocalDate dataNascimento;
	
	private String cpf;
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getNumeroWhats() {
		return numeroWhats;
	}

	public void setNumeroWhats(String numeroWhats) {
		this.numeroWhats = numeroWhats;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
}
