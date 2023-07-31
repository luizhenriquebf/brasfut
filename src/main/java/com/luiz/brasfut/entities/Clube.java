package com.luiz.brasfut.entities;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clubes")
public class Clube {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String nome;
	@Column(columnDefinition = "TEXT")
	private String escudo;
	private Integer fundacao;
	
	@OneToMany(mappedBy = "clube")
	private List<Jogador> jogadores;
	
	@Deprecated
	public Clube() {}
	
	public Clube(Long id, String nome, String escudo, Integer fundacao, List<Jogador> jogadores) {
		super();
		this.id = id;
		this.nome = nome;
		this.escudo = escudo;
		this.fundacao = fundacao;
		this.jogadores = jogadores;
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

	public String getEscudo() {
		return escudo;
	}

	public void setEscudo(String escudo) {
		this.escudo = escudo;
	}

	public Integer getFundacao() {
		return fundacao;
	}

	public void setFundacao(Integer fundacao) {
		this.fundacao = fundacao;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
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
		Clube other = (Clube) obj;
		return Objects.equals(id, other.id);
	}

}
