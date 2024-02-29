package com.danielmonteiro.leilao.controle;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.danielmonteiro.leilao.controller.form.LeilaoForm;
import com.danielmonteiro.leilao.controllerDTO.LeilaoDTO;
import com.danielmonteiro.leilao.model.Leilao;
import com.danielmonteiro.leilao.repositorio.LeilaoRepositorio;


@RestController
@RequestMapping("/leilao/")
public class LeilaoController {

	@Autowired
	private LeilaoRepositorio leilaoRepo;
	
	@PostMapping
	public ResponseEntity<LeilaoDTO> inserir(@RequestBody LeilaoForm leilaoForm, UriComponentsBuilder uriBuilder){
		
		Leilao leilao = leilaoForm.toLeilao();
		LeilaoRepositorio leilaoRepo = null; //instancia do repositorio
		leilaoRepo.save(leilao);//salva 
		
		LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);//DTO para adiçao
		uriBuilder.path("/aeroportos/{id}");//caminho 
		URI uri = uriBuilder.buildAndExpand(leilao.getId()).toUri();
		
		return ResponseEntity.created(uri).body(leilaoDTO);
	}
	
	@GetMapping
	public List<LeilaoDTO> listaLeilao(String descricao, String status, double valorMinimo ){
		
		List<Leilao> leilao;
		
		if(descricao != null) {
			leilao = (ArrayList<Leilao>) leilaoRepo.findByDescricao(descricao);	
			}
		if(status != null) {
				leilao = (ArrayList<Leilao>) leilaoRepo.findByStatus(status);			
			}
		if(valorMinimo > 0) {
			leilao = (ArrayList<Leilao>) leilaoRepo.findByValorMinimo(valorMinimo);			
		    }		
		else {
				leilao = (ArrayList<Leilao>) leilaoRepo.findAll();		
			}
		
		List<LeilaoDTO> lista = new ArrayList<LeilaoDTO>();
		for(Leilao leiloes: leilao) {
			LeilaoDTO leilaoDTO = new LeilaoDTO(leiloes);
			lista.add(leilaoDTO);
		}//for 
		
		return lista;
	}
	
	
	//metodo listar por ID
    @GetMapping("/{id}")
	public ResponseEntity<?> listaLeilao(@PathVariable Integer id){
		
		try {
			Leilao leilao = leilaoRepo.getReferenceById(id);
			LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
			return ResponseEntity.ok(leilaoDTO);
			
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}	
}

  //metodo para alterar
    @PutMapping("/{id}")
    public ResponseEntity<?> alteraLeilao(@PathVariable Integer id, @RequestBody LeilaoForm leilaoForm){
		
    	if(id == null) {
    		return ResponseEntity.badRequest().build();    		
    	}
    	
    	try {
    		Leilao leilao = leilaoRepo.getReferenceById(id); //buscar pelo ID
			leilao.setDescricao(leilaoForm.getDescricao());
			leilao.setStatus(leilaoForm.getStatus());
			leilao.setValorMinimo(leilaoForm.getValorMinimo());
			leilaoRepo.save(leilao); //Salva
			LeilaoDTO leilaoDTO = new LeilaoDTO(leilao); //instancia do repositorio
			return ResponseEntity.ok(leilaoDTO);
    		
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
    }
    
    
  //metodo para excluir buscando pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletaLeilao(@PathVariable Integer id){
		//busca pelo id e exclui os dados do usuario
    	if(id == null) {
    		return ResponseEntity.badRequest().build();    		
    	}
    	
    	try {
    		Leilao leilao = leilaoRepo.getReferenceById(id); //buscar pelo ID
    		leilaoRepo.delete(leilao); //Exclui o usuario
    		LeilaoDTO leilaoDTO = new LeilaoDTO(leilao); //instancia usuarioDTO com o usuario do repositorio
			return ResponseEntity.ok(leilaoDTO);
    		
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
}
    
    
    
}


