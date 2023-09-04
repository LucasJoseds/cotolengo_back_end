package com.unitins.projeto_amigo10.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.unitins.projeto_amigo10.dto.VoluntarioDTO;

@Entity
public class Voluntario{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="area_atuacao")
	private String areaAtuacao;
	
	@Column(name="disponibilidade")
	private String disponibilidade;
	
	@Column(name="observacao")
	private String observacao;

	@ManyToOne
	@JoinColumn(name="pessoa_fisica_id")
	private PessoaFisica pessoaFisica;
	
	@ManyToOne
	@JoinColumn(name="pessoa_juridica_id")
	private PessoaJuridica pessoaJuridica;
	
	@Column(name="ativo")
	private boolean ativo;
	
	public Voluntario(){

	}
	
	public Voluntario(VoluntarioDTO dto){

		this.id=dto.getId();
		this.areaAtuacao=dto.getAreaAtuacao();
		this.ativo=dto.isAtivo();
		this.disponibilidade=dto.getDisponibilidade();
		this.observacao=dto.getObservacao();
	}

	public Voluntario(VoluntarioDTO dto, PessoaFisica pessoaFisica){

		this.id=dto.getId();
		this.areaAtuacao=dto.getAreaAtuacao();
		this.ativo=dto.isAtivo();
		this.disponibilidade=dto.getDisponibilidade();
		this.pessoaFisica=pessoaFisica;
		this.observacao=dto.getObservacao();
	}

	public Voluntario(VoluntarioDTO dto ,  PessoaJuridica pessoaJuridica){

		this.id=dto.getId();
		this.areaAtuacao=dto.getAreaAtuacao();
		this.ativo=dto.isAtivo();
		this.disponibilidade=dto.getDisponibilidade();
		this.pessoaJuridica= pessoaJuridica;
		this.observacao=dto.getObservacao();
	}


	
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
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(PessoaJuridica pessoaJurudica) {
		this.pessoaJuridica = pessoaJurudica;
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
		Voluntario other = (Voluntario) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
