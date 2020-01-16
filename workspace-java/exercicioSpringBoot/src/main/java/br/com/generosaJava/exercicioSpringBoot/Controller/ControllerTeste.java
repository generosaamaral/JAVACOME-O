package br.com.generosaJava.exercicioSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.generosaJava.exercicioSpringBoot.Model.Servicos;
import br.com.generosaJava.exercicioSpringBoot.Model.Usuarios;

@RestController

public class ControllerTeste {
	Usuarios usu = new Usuarios(5, "genyamaral", "generosa@.com", "generosaamaral", "1234", "jajava");
	Servicos ser = new Servicos(6, "ajax", "limpeza", 10, 20, "ggggg");

	@GetMapping("/hello")
	public String sayHello() {
		return "Bom dia mundo! Meu primeiro projeto em Spring Boot";
	}

	@GetMapping("/usuario")
	public Usuarios Meuusuario() {
		return usu;
	}

	@GetMapping("/servico")
	public Servicos Servico() {
		return ser;
	}

}
