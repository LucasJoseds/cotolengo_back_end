package com.unitins.projeto_amigo10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PessoaJuridica {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="nome_empresa")
	private String nomeEmpresa;
	
	@Column(name="email")
	private String email;
	
	@Column(name="cnpj")
	private String cnpj;
	
	@Column(name="numero_telefone")
	private String numeroTelefone;
	
	@Column(name="numero_whatsapp")
	private String numeroWhats;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	
	
	
	
}
