package org.generation.blogPessoal.repository;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

	//METODOS PARA ENCONTRAR O LOGIN

	Usuario findByLogin(String login);
	
}
