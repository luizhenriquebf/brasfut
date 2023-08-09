package com.luiz.brasfut.dto;

import org.springframework.beans.BeanUtils;

public class Campeonato {
    private Long id;
    private String nome;
    private String localDisputa;

    public Campeonato(Campeonato entity) {
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
    public String getLocalDisputa() {
        return localDisputa;
    }
    public void setLocalDisputa(String localDisputa) {
        this.localDisputa = localDisputa;
    }

    
}
