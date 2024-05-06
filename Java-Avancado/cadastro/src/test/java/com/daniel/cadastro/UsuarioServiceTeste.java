package com.daniel.cadastro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.daniel.cadastro.model.Usuario;
import com.daniel.cadastro.repositorio.UsuarioRepositorio;
import com.daniel.cadastro.service.UsuarioServiceV1;


@ExtendWith(MockitoExtension.class)//anotação para dizer que está usando Mockito
public class UsuarioServiceTeste {

	@InjectMocks
	private UsuarioServiceV1 usuarioService;

	@Mock
	private UsuarioRepositorio usuarioRepo;

	Usuario usuario = new Usuario(1L,"Daniel","daniel@gmail.com","123");

	@Test
	public void deveSalvarUsuarioRepositorio() {

		//configuração teste
		when(usuarioRepo.save(any(Usuario.class))).thenReturn(usuario);


		//ação do teste
		Usuario usuarioSalvo = usuarioService.criarUsuario(usuario);


		//assert		
		assertEquals(usuarioSalvo.getNome(), usuario.getNome());
		assertEquals(usuarioSalvo.getEmail(), usuario.getEmail());
		assertEquals(usuarioSalvo.getSenha(), usuario.getSenha());

	}


	@Test
	public void buscarPorIdRepositorio() {

		//configuração teste
		when(usuarioRepo.findById(any(Usuario.class))).thenReturn(usuario);

		//ação do teste
		Usuario usuarioSalvo = usuarioService.usuarioById(usuario);

		//assert		
		assertEquals(usuarioSalvo.getNome(), usuario.getNome());
		assertEquals(usuarioSalvo.getEmail(), usuario.getEmail());
		assertEquals(usuarioSalvo.getSenha(), usuario.getSenha());

	}

}
