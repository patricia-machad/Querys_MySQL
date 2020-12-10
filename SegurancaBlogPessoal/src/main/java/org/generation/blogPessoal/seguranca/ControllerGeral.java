package org.generation.blogPessoal.seguranca;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerGeral {

	//INJETA O REPOSITORY 
	@Autowired
	public TemaRepository repository;
	
	//DIRECIONA O USUARIO PARA O INDEX
	
	@GetMapping(value="/")
	public String login() {
		return "index";
	}
	
	//DIRECIONA O USUARIO PARA FORMTEMA
	@GetMapping(value="/cadastrarTema")
	public String form() {
		return "formTema";
	}
	
	
	//CADASTRA O TEMA NA TABELA (TEMA) E DEPOIS REDIRECIONA O USUARIO PARA UM NOVO CADASTRO (TEMA)
	@PostMapping(value="/cadastrarTema")
	public String form(Tema tema) {
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}
	
}
