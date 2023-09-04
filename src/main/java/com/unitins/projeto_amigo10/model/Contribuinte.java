package com.unitins.projeto_amigo10.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.unitins.projeto_amigo10.dto.ContribuinteDTO;

@Entity
public class Contribuinte {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "data_recebimento")
	private LocalDate dataRecebimento;

	@Column(name = "deve_buscar")
	private boolean deveBuscar;

	@ManyToOne
	@JoinColumn(name = "pessoa_fisica_id")
	private PessoaFisica pessoaFisica;

	@ManyToOne
	@JoinColumn(name = "pessoa_juridica_id")
	private PessoaJuridica pessoaJuridica;

	@Column(name = "recebido")
	private boolean recebido;


	public Contribuinte(){

	}

	public Contribuinte(ContribuinteDTO dto, PessoaFisica pessoaFisica) {
		this.id = dto.getId();
		this.descricao = dto.getDescricao();
		this.dataRecebimento =dto.getDataRecebimento();
		this.deveBuscar = dto.isDeveBuscar();
		this.pessoaFisica = pessoaFisica;
		this.recebido = dto.isRecebido();
	}

	public Contribuinte(ContribuinteDTO dto, PessoaJuridica pessoaJuridica) {
		this.id = dto.getId();
		this.descricao = dto.getDescricao();
		this.dataRecebimento =dto.getDataRecebimento();
		this.deveBuscar = dto.isDeveBuscar();
		this.pessoaJuridica = pessoaJuridica;
		this.recebido = dto.isRecebido();
	}

	public Contribuinte(ContribuinteDTO dto){

		
	}

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

	public boolean isRecebido() {
		return recebido;
	}

	public void setRecebido(boolean recebido) {
		this.recebido = recebido;
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
		Contribuinte other = (Contribuinte) obj;
		return Objects.equals(id, other.id);
	}

}
