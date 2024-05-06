package com.daniel.cadastro.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import com.daniel.cadastro.model.Usuario;
import com.daniel.cadastro.repositorio.UsuarioRepositorio;


@Service
@Primary
@Qualifier("v1")
public class UsuarioServiceV1 {

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

  
	public Usuario atualizaUsuario(Long id, Usuario usuario) {
		return null;
	}

	public void deletaUsuario(Long id) {
	}

	public Usuario usuarioById(Usuario usuario) {
		return null;
	}

	public Page<Usuario> findall(PageRequest of) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
