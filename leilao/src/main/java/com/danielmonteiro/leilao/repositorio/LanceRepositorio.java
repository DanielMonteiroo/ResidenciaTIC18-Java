package com.danielmonteiro.leilao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielmonteiro.leilao.model.Lance;

public interface LanceRepositorio extends JpaRepository<Lance, Long>{

}
