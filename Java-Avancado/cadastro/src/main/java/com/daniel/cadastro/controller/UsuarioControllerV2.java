package com.daniel.cadastro.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.daniel.cadastro.model.Usuario;
import com.daniel.cadastro.service.UsuarioServiceV2;

@RestController
@RequestMapping(value = "/v2/usuarios")
public class UsuarioControllerV2 {

	@Autowired
	private UsuarioServiceV2 usuService2;

	// Deleta todos usuarios
	@DeleteMapping
	public String deletaUsuarios() {
		usuService2.deletaUsuarios();
		return "Usuarios excluidos com sucesso!";
	}

	// Deleta usuario pelo ID
	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable @NonNull Long id) {
		usuService2.deleteUsuario(id);
	}

	//Definição de Parametros para paginação
	@Cacheable
	@GetMapping
	public ResponseEntity<List<Usuario>> todosUsuarios(
			@RequestParam(defaultValue = "0")int page,
			@RequestParam(defaultValue = "10")int size,
			@RequestParam(defaultValue = "ASC") @NonNull String ordem,
			@RequestParam(defaultValue = "nome")String atributo){
		
		//Definição da ordenação
		Sort sort = Sort.by(Direction.fromString(ordem), atributo);
		
		Pageable pagealbe= PageRequest.of(page, size, sort);
		
		//Lista em formato de Pagina,retornando os usuarios
		Page<Usuario> usuarioPage = usuService2.busca(pagealbe);

		//Se a lista for vazia,retona msg de não contem
		if(usuarioPage.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(usuarioPage.getContent(),HttpStatus.OK);
	}

	//Endpoint para filtrar
	//Definição do filtro
   @GetMapping(value = "/filtro")
   public ResponseEntity<List<Usuario>> buscaPorFiltro(
		   @RequestParam String nome){
	      
	       List<Usuario> usuarios = usuService2.buscaContaingNome(nome);
	       
	   return new ResponseEntity<>(usuarios,HttpStatus.OK);
   }



}





