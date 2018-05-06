package com.ivson.modelagemconceitual.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ivson.modelagemconceitual.model.Categoria;
import com.ivson.modelagemconceitual.services.CategoriaService;

/**
 * PACKAGE resource = nome padrao para os recursos em uma API
 * @author Santo
 *
 */
@RestController
@RequestMapping(value="/categorias")	// nome do Endpoint REST, por padrao de mercado no plural
public class CategoriaResource {

	@Autowired
	private CategoriaService service;	
	
	/**
	 * OP spring Boot ja tem um conversor automatico que transforma qqr objeto em um JSON
	 * RESPOSNSE ENTITY = ja traz um encapsulamento de uma resposta do tipo REST
	 * @return
	 */
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {		
		Categoria obj = service.buscar(id); 		
		return ResponseEntity.ok().body(obj);
	}
	
	/**
	 * A operacao SAVE do repository devolve um objeto
	 * REquestBody faz o JSON ser convertido para um objeto java
	 * @param categoria
	 * @return
	 */
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Categoria categoria) {
		
		// insere aqui no banco de dados (cria um ID)
		categoria = service.insert(categoria);
		
		// montar o URI (http://localost:8081/categorias/3) para devolver no ResponseEntity
		URI uri = ServletUriComponentsBuilder
				  .fromCurrentRequest() // pega o endecero deste endpoint (localhost:8081/categorias)
				  .path("/{id}")		
				  .buildAndExpand(categoria.getId()) // como ja foi salvo no banco, ja temos o id aqui
				  .toUri();
		
		// buscar no google Http Status Code para ver os codigos que deve vir
		return ResponseEntity.created(uri)	// created chama o status 201 (created)
							 .build();  // gera a resposta para o response (a uri)
	}
	
	
	//saveAll
}
