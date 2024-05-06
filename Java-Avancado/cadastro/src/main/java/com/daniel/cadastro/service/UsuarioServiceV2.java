package com.daniel.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.daniel.cadastro.model.Usuario;
import com.daniel.cadastro.repositorio.UsuarioRepositorio;

@Service
@Qualifier("v2")
public class UsuarioServiceV2 extends UsuarioServiceV1 {

	@Autowired
	private UsuarioRepositorio usuRepo;
	
	  // Deleta todos usuarios
    public void deletaUsuarios() {
    	usuRepo.deleteAll();
    }

    // Deleta um usuario
    public void deleteUsuario(@NonNull Long id) {
    	usuRepo.deleteById(id);
    }
	
    //Metodo busca por paginação
	public Page<Usuario> busca(@NonNull Pageable paginacao){
		
		return usuRepo.findAll(paginacao);	
	}
	
	//Metodo busca com filtro
	public List<Usuario> buscaContaingNome(String nome){
		
		return usuRepo.findByNomeContainingIgnoreCase(nome);
	}

	
	
}
