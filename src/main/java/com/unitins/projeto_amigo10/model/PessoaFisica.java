package com.unitins.projeto_amigo10.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PessoaFisica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id; 
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="numero_telefone")
	private String numeroTelefone;
	
	@Column(name="numero_whats")
	private String numeroWhats;
	
	@Column(name="data_nascimento")
	private LocalDate dataNascimento;
	
	@Column(name="cpf")
	private String cpf;
	
	
	public PessoaFisica(){
		
	}
	public PessoaFisica(Long id){
		this.id=id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
