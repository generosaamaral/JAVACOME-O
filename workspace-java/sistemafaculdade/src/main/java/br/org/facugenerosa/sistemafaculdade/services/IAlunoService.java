package br.org.facugenerosa.sistemafaculdade.services;

import java.util.List;

import br.org.facugenerosa.sistemafaculdade.model.Aluno;

public interface IAlunoService  {
	public List<Aluno> recuperarTodos();
	public Aluno RecuperarPorId(int id);

}
