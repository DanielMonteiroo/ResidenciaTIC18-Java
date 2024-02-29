package com.danielmonteiro.leilao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielmonteiro.leilao.model.Concorrente;

public interface ConcorrenteRepositorio extends JpaRepository<Concorrente, Long>{

}
