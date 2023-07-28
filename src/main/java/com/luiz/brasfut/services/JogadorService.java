package com.luiz.brasfut.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luiz.brasfut.dto.JogadorDTO;
import com.luiz.brasfut.entities.Jogador;
import com.luiz.brasfut.repositories.JogadorRepository;

@Service
public class JogadorService {
	
	@Autowired
	JogadorRepository jogadorRepository;
	
	public JogadorDTO findById(Long id) {
		return new JogadorDTO(jogadorRepository.findById(id).get());
	}
	
	@Transactional(readOnly = true)
	public List<JogadorDTO> findAll() {
		List<Jogador> resultado = jogadorRepository.findAll();
		return resultado.stream().map(x -> new JogadorDTO(x)).toList();
	}
	
}
