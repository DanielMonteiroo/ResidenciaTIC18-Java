package com.daniel.cadastro.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.cadastro.model.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
