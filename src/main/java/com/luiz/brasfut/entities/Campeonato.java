package com.luiz.brasfut.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "campeonatos")
public class Campeonato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nome;
	private Integer anoCriacao;
	private String logo;

	@ManyToMany
	@JoinTable(
		name = "times_disputando",
		joinColumns = @JoinColumn(name = "campeonato_id"),
		inverseJoinColumns = @JoinColumn(name = "clube_id"))
	private List<Clube> clubes;
	
	@Deprecated
	public Campeonato() {}
	
	public Campeonato(Long id, String nome, Integer anoCriacao, String localDisputa) {
		this.id = id;
		this.nome = nome;
		this.anoCriacao = anoCriacao;
		this.logo = localDisputa;
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
	public Integer getAnoCriacao() {
		return anoCriacao;
	}
	public void setAnoCriacao(Integer anoCriacao) {
		this.anoCriacao = anoCriacao;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String localDisputa) {
		this.logo = localDisputa;
	}

	

}
