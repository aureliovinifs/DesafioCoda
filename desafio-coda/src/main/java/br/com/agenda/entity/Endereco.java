package br.com.agenda.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "endereco", schema = "agenda")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long id;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	@JoinColumn(name = "id_contato" )
	private Contato contato;

	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "numero")
	private int numero;

	@Column(name = "uf")
	private String uf;

	@Column(name = "municipio")
	private String municipio;

	@Column(name = "cep")
	private String cep;

	@Column(name = "preferencial")
	private String preferencial;

	public Long getIdEndereco() {
		return id;
	}

	public void setIdEndereco(Long idEndereco) {
		this.id = idEndereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPreferencial() {
		return preferencial;
	}

	public void setPreferencial(String preferencial) {
		this.preferencial = preferencial;
	}

}