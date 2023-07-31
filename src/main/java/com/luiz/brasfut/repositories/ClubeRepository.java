package com.luiz.brasfut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.brasfut.entities.Clube;

public interface ClubeRepository extends JpaRepository<Clube, Long> {

}
