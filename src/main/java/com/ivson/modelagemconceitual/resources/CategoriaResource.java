package com.ivson.modelagemconceitual.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * PACKAGE resource = nome padrao para os recursos em uma API
 * @author Santo
 *
 */
@RestController
@RequestMapping(value="/categorias")	// nome do Endpoint REST, por padrao de mercado no plural
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST esta funcionando";
	}
}
