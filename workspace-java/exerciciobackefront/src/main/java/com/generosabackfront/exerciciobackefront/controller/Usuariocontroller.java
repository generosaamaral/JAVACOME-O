package com.generosabackfront.exerciciobackefront.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generosabackfront.exerciciobackefront.Security.Autenticator;
import com.generosabackfront.exerciciobackefront.Security.Token;
import com.generosabackfront.exerciciobackefront.model.Usuario;

@RestController
@CrossOrigin("*")

public class Usuariocontroller {
	
	@PostMapping("/login")
	public ResponseEntity<Token> autentica(@RequestBody Usuario usuario){
		if ( usuario.getEmail().equals("user@user.com")&& usuario.getSenha().equals("1234")) {
			// simulando q recuperei o usuário do banco de dados
			usuario.setId(1);
			usuario.setNome("Professor Isidro");		
			// precisamos construir o Token
			
			String tk = Autenticator.generateToken(usuario);
			System.out.println("TOKEN Gerado = "+tk);
			Token token = new Token();
			token.setStrToken(tk);
			return ResponseEntity.ok(token);
		}
		else {
			return ResponseEntity.status(403).build();
		}
		
	}
	








}
