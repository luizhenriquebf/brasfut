package com.luiz.brasfut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.brasfut.entities.Campeonato;

public interface CampeonatoRepository extends JpaRepository<Campeonato,Long> {
    
}
