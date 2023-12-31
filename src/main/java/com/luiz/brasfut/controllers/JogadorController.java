package com.luiz.brasfut.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiz.brasfut.dto.JogadorDTO;
import com.luiz.brasfut.entities.Jogador;
import com.luiz.brasfut.services.JogadorService;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

	@Autowired
	JogadorService jogadorService;
	

	
	@GetMapping("/{id}")
	public JogadorDTO findByIdDTO(@PathVariable Long id) {
		return jogadorService.findByIdDTO(id);
	}
	
	@GetMapping
	public List<JogadorDTO> findAllDTO() {
		return jogadorService.findAllDTO();
	}
	
	@GetMapping("/full")
	public List<Jogador> findAll(){
		return jogadorService.findAll();
	}
	
	@GetMapping("/full/{id}")
	public Jogador findById(@PathVariable Long id) {
		return jogadorService.findById(id);
	}
}
