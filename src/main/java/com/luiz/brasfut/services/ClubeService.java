package com.luiz.brasfut.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luiz.brasfut.dto.ClubeDTO;
import com.luiz.brasfut.repositories.ClubeRepository;

@Service
public class ClubeService {
	
	@Autowired
	private ClubeRepository clubeRepository;

	public ClubeDTO findByIdDTO(Long id) {
		return new ClubeDTO(clubeRepository.findById(id).get());
	}
	
	public List<ClubeDTO> findAllDTO() {	
		return clubeRepository.findAll().stream().map(x -> new ClubeDTO(x)).toList();
	}
 }
