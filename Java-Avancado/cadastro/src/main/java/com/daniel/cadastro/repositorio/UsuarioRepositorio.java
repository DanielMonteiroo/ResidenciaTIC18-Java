package com.daniel.cadastro.repositorio;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.cadastro.model.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

	Object findById(Usuario any);

    Page<Usuario> findAll(Pageable paginacao);

	List<Usuario> findByNomeContainingIgnoreCase(String nome);
}
