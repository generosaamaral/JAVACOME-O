package br.org.facugenerosa.sistemafaculdade.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.facugenerosa.sistemafaculdade.dao.AlunoRepo;
import br.org.facugenerosa.sistemafaculdade.model.Aluno;

@Component
public class AlunoServiceImpl implements IAlunoService {

	@Autowired
	private AlunoRepo repo;

	public List<Aluno> recuperarTodos() {
		return (List<Aluno>) repo.findAll();
	}

	public Aluno RecuperarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	

}
