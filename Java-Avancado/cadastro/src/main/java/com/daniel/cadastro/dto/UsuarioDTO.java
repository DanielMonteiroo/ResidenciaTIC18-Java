package com.daniel.cadastro.dto;

import com.daniel.cadastro.model.Usuario;

public class UsuarioDTO {

private Long id;
private String nome;
private String email;
private String senha;

//CONSTRUTOR
public UsuarioDTO(Usuario usuario) {
	
	this.id = usuario.getId();
	this.nome = usuario.getNome();
	this.email = usuario.getEmail();
	this.senha = usuario.getSenha();
		
}

//GETTERS
public Long getId() {
	return id;
}


public String getNome() {
	return nome;
}


public String getEmail() {
	return email;
}


public String getSenha() {
	return senha;
}





	
}
