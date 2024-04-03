package com.daniel.cadastro.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;


import com.daniel.cadastro.model.Usuario;
import com.daniel.cadastro.repositorio.UsuarioRepositorio;

@Service
public class UsuarioService {

	@Autowired
    private UsuarioRepositorio usoRepo;

    // Criando novo usuario
    public Usuario criarUsuario(@NonNull Usuario usuario) {
        return usoRepo.save(usuario);
    }

    // lista todos usuarios
    public List<Usuario> listaUsuarios() {
        return usoRepo.findAll();
    }

    // busca por ID
    public Optional<Usuario> usuarioById(@NonNull Long id) {
        return usoRepo.findById(id);
    }

    // Atualiza usuario
    public Usuario updateUsuario(@NonNull Long id, Usuario usuario) {
        Optional<Usuario> user = usoRepo.findById(id);
        if (user.isPresent()) {
            Usuario usuExistente = user.get();
            usuExistente.setNome(usuario.getNome());
            usuExistente.setEmail(usuario.getEmail());
            return usoRepo.save(usuExistente);
        }
        return usuario;
    }

    // Deleta todos usuarios
    public void deletaUsuarios() {
    	usoRepo.deleteAll();
    }

    // Deleta um usuario
    public void deleteUsuario(@NonNull Long id) {
    	usoRepo.deleteById(id);
    }

	public Usuario atualizaUsuario(Long id, Usuario usuario) {
		return null;
	}

	public void deletaUsuario(Long id) {
	}

	

	
}
