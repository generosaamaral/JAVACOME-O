package com.generosabackfront.exerciciobackefront.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generosabackfront.exerciciobackefront.Security.Autenticator;
import com.generosabackfront.exerciciobackefront.model.Aluno;

@RestController
@CrossOrigin("*")


public class Alunocontroller {
	
	
	@GetMapping("/aluno/Todos")
	
	public ResponseEntity<ArrayList<Aluno>> getallalunos(@RequestParam String token){
	if(Autenticator.isValid(token))	{
	
	ArrayList<Aluno> lista = new ArrayList<Aluno>();
	for(int i=0; i<20; i++) {
	 Aluno a = new Aluno();
	 a.setCodigo((i+1)*100);
	 a.setTitulo("Titulo "+(i+1));
	 a.setDetalhes("aluno da decima serie"+(i+1));
	 a.setPreco(80+(i+1));
	 
	 lista.add(a);
	}
	return ResponseEntity.ok(lista);

	}
	else {
		return ResponseEntity.status(403).build();
	}
	
	}

}

