package com.luiz.brasfut.dto;

import org.springframework.beans.BeanUtils;

import com.luiz.brasfut.entities.Jogador;

public class JogadorDTO {
	private Long id;
	private String nome;
	private String foto;
	private String posicao;
	
	
	public JogadorDTO(Jogador entity) {
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


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getPosicao() {
		return posicao;
	}


	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
}
