package com.luiz.brasfut.dto;

import org.springframework.beans.BeanUtils;

import com.luiz.brasfut.entities.Clube;

public class ClubeDTO {

	private Long id;
	private String nome;
	private String escudo;
	
	public ClubeDTO(Clube entity) {
		BeanUtils.copyProperties(entity, this);
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
	
}
