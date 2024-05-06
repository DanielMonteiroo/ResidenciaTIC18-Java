package com.daniel.cadastro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.cadastro.model.Usuario;
import com.daniel.cadastro.service.UsuarioServiceV1;

@RestController
@RequestMapping("/v1/usuarios")
public class UsuarioControllerV1 {

	@Autowired
	private UsuarioServiceV1 usuarioService;

	// Cria novo usuario
	@PostMapping
	public Usuario criarUsuario(@RequestBody @NonNull Usuario user) {
		return usuarioService.criarUsuario(user);
	}

	// Lista todos usuarios
	@GetMapping
	public List<Usuario> listaUsuarios() {
		return usuarioService.listaUsuarios();
	}

	// Busca pelo ID
	@GetMapping("/{id}")
	public Optional<Usuario> usuarioById(@PathVariable @NonNull Long id) {
		return usuarioService.usuarioById(id);
	}

	// Atualiza usuario pelo ID
	@PutMapping("/{id}")
	public Usuario updateUsuario(@PathVariable @NonNull Long id, @RequestBody Usuario usuario) {
		return usuarioService.updateUsuario(id, usuario);
	}
	
}


